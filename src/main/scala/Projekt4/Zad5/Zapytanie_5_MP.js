use nbd
var mapFun1 = function(){
valuty = []
if(this.sex == "Female" && this.nationality =="Poland")
{
    for(var item in this.credit){
        for(var i in item){
                emit(this.credit[item].currency,this.credit[item].number);
        }
    }
}

};
var reduceFun1 = function(valuty, values){
	var resultObj = {
      sum: 0,
      count: 0
    };
    var result= 0;
    values.forEach(function(item,index){
        resultObj.sum += parseFloat(item);
    });
	resultObj.count = values.length
    return resultObj;
};
var  finalizeFun1 = function(valuty, resultObj){
    return resultObj.sum/resultObj.count;
};
db.people.mapReduce(mapFun1,reduceFun1,{out:"reduceTable",finalize:finalizeFun1})
db.reduceTable.find()