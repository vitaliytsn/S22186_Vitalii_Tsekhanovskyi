use nbd
 db.people.updateMany(
 {first_name:"Antonio"},
 {$set:{"hobby":"pingpong"}},
 false,
 true
 )

  db.people.find(
 {first_name:"Antonio"},
 {first_name:1,hobby:1}
 )