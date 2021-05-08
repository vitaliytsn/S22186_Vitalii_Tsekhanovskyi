use nbd
printjson(
db.people.insertOne(
{
birth_date:"1997-10-14",
email:"vitaliytsn@gmail.com",
first_name:"Vitalii",
last_name:"Tsekhanovskyi",
height:183,
job:".Net fullStack developer",
nationality:"Ukrainian",
sex:"Male",
weight:"73"
}
)
)