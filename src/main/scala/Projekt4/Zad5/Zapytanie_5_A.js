use nbd

db.people.aggregate(
    [
        {$match:{"nationality":"Poland"}},
        {$match:{"sex":"Female"}},
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