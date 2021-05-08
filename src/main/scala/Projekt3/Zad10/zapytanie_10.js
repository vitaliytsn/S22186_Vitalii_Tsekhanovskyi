use nbd
 db.people.updateMany(
 {job:"Editor"},
 {$unset:{"email":1}},
 false,
 true
 )

  db.people.find(
 {job:"Editor"},
{email:1}
 )