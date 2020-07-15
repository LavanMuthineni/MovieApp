# MovieApp

Description : 
Given list of movies with name, startDate and endDate, this app will return maxProfit actor can get and list of movies he has to do for the same.
time format "dd MMM", ex: "25 Mar"

Algo Logic Class : MovieController.java
   

Run API :  

1. Clone the Repo : 
  git clone https://github.com/LavanMuthineni/MovieApp.git

2. go to MovieApp project cloned above

3. Run API : run the MovieApp jar :
   java -jar target/MovieApp-1.0.1.jar

4. Use the below API sample 



Sample API :
POST http://localhost:8080/movies/maxProfit

Headers :
Content-Type:application/json

Body : 

[
	{
		"name" : "lavan movie1",
		"startDate" : "03 JAN",
		"endDate" : "23 JAN"
	},
	{
		"name" : "lavan movie2",
		"startDate" : "25 FEB",
		"endDate" : "3 MAR"
	},
	{
		"name" : "lavan movie3",
		"startDate" : "3 MAR",
		"endDate" : "13 MAR"
	}
]



Sample OutPut :
{
    "maxProfit": 2,
    "selectedMovies": [
        {
            "name": "lavan movie1",
            "startDate": "03 Jan",
            "endDate": "23 Jan"
        },
        {
            "name": "lavan movie2",
            "startDate": "25 Feb",
            "endDate": "03 Mar"
        }
    ]
}
