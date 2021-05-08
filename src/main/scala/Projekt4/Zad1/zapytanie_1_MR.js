use nbd
var mapFun1 = function(){emit(this.sex,[this.height,this.weight]);};
var reduceFun1 = function(sex, values){
    var resultH = 0;
    var resultW = 0;
    values.forEach(function(item,index){
        resultH += parseFloat(item[0]);
        resultW += parseFloat(item[1]);
    });
    return [resultH/values.length,resultW/values.length];
};
db.people.mapReduce(mapFun1,reduceFun1,{out:"reduceTable"})

db.reduceTable.find()