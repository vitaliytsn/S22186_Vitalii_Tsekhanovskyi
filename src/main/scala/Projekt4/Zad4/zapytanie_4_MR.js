use nbd
var mapFun1 = function(){emit(this.nationality,[this.height,this.weight]);};
var reduceFun1 = function(nationality, values){
    var minBMI = 100;
    var maxBMI = 0;
    var avgBMI = 0
    values.forEach(function(item,index){
        var height = parseFloat(item[0])
        var weight = parseFloat(item[1])
        var BMI = weight/(height*height);
        if(BMI>maxBMI)maxBMI = BMI;
        if(BMI<minBMI)minBMI = BMI;
        avgBMI+=BMI;
    });
    avgBMI=avgBMI/values.length;
    return [minBMI,maxBMI,avgBMI];
};
db.people.mapReduce(mapFun1,reduceFun1,{out:"reduceTable"})

db.reduceTable.find()