use nbd
printjson(
db.people.find(
{nationality:"China"}
).limit(1)
)