use nbd
printjson(
db.people.find(
{
weight:{$gt:"68",$lte:"71.5"},
}
)
)