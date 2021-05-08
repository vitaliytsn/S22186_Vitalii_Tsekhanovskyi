use nbd

db.people.aggregate(
    [
        {
            $group:
            {
                "_id":"$job",
                "srodki": {$sum :1}
            }
        },
        {$project:{_id:1,srodki:0}}
    ]
)