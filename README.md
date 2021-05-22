# RewardsAPI
Coding Challenge for Fetch Rewards

Backend REST API web service for tracking a user's rewards point balance.  Written in JAVA. Accepts HTTP requests formatted in JSON, including support for the following routes:

1. /viewPoints: Accepts GET requests and returns the user's current points balance
2. /addPoints: Accepts POST requests in the format { "payer": "DANNON", "points": 1000, "timestamp": "2020-11-02T14:00:00Z" } and echos back the applied points.
3. /spendPoints: Accepts POST requests in the format { "points": 5000 } and responds with the name of each payer who originally contributed the points, as well as the amount of points spent from each.  Points are spent based on the longest ago earned points being spent first (based on submitted timestamp).
