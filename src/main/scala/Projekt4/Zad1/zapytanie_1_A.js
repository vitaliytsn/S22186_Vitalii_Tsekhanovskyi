db.people.aggregate(
    [
        {
            $group:
            {
                "_id":"$sex",
                "sredniWzrost": {$avg:"$height"},
                "sredniaWaga": {$avg:"$weight"}
            }
        },
    ]
)