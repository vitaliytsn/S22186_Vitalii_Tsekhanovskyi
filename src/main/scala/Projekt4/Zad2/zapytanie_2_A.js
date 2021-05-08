use nbd

db.people.aggregate(
    [
        {$unwind:"$credit"},
        {
            $group:
            {
                "_id":"$credit.currency",
                "srodki": {$sum:"$credit.number"},
            }
        },
    ]
)