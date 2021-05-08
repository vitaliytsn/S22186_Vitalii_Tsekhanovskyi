use nbd

db.people.find({"location.city":"Moscow"}).forEach(function(ludek){
    db.people.updateOne(
        {"location.city":"Moscow"},
        {$set:{"location.city":"Moskwa"}}
    )
 })

 db.people.find(
 {"location.city":"Moskwa"},
 {location:1}
 )