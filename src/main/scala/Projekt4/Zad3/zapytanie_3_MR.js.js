use nbd

db.people.aggregate(
    [
        {
            $group:
            {
                "_id":"$job",
                "sredniWzrost": {$avg:"$height"}
            }
        },
        {$project:{_id:1}}
    ]
)