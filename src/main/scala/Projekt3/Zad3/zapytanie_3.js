use nbd
printjson(
db.people.find(
{
nationality:"Germany",
sex:"Male"
}
)
)