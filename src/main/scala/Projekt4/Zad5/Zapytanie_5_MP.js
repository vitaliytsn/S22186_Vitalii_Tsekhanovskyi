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
    var result= 0;
    values.forEach(function(item,index){
        result += parseFloat(item);
    });
    return [result/values.length,result];
};
db.people.mapReduce(mapFun1,reduceFun1,{out:"reduceTable"})
db.reduceTable.find()