use nbd

db.people.aggregate(
    [
        {
            $group:
            {
                "_id":"$nationality",
                "BMI_AVG": {$avg :{$divide: ["$weight",{$multiply: [ "$height", "$height" ]}]}},
                "BMI_MIN": {$min :{$divide: ["$weight",{$multiply: [ "$height", "$height" ]}]}},
                "BMI_MAX": {$max :{$divide: ["$weight",{$multiply: [ "$height", "$height" ]}]}}
            }
        },
    ]
)