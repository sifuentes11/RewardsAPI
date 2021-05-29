# RewardsAPI
Coding Challenge for Fetch Rewards

Backend REST API web service for tracking a user's rewards point balance.  Written in JAVA. Accepts HTTP requests formatted in JSON, including support for the following routes:

1. /viewPoints: Accepts GET requests and returns the user's current points balance
2. /addPoints: Accepts POST requests in the format { "payer": "DANNON", "points": 1000, "timestamp": "2020-11-02T14:00:00Z" } and echos back the applied points.
3. /spendPoints: Accepts POST requests in the format { "points": 5000 } and responds with the name of each payer who originally contributed the points, as well as the amount of points spent from each.  Points are spent based on the longest ago earned points being spent first (based on submitted timestamp).

## How to Run Code

Run server.java

## Sample Commands to Interact with API:

ADD POINTS: curl -i -X POST -H 'Content-Type: application/json' -d '{ "payer": "DANNON", "points": 500, "timestamp": "2020-11-02T14:00:00Z" }' http://localhost:9000/addPoints

VIEW POINTS: curl -i -X GET http://localhost:9000/viewPoints

SPEND POINTS: curl -i -X POST -H 'Content-Type: application/json' -d '{ "points": 200 }' http://localhost:9000/spendPoints

