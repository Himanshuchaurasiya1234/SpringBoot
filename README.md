# -Weather-forecast-Project
Write a server by using SpringBoot Java and integrate Weather API from Rapid API. On the basis of that integration, expose your RESTful APIs as follows with JSON response. Authentication Method: Header-based authentication with random client id and random client secret


# How to Run Project

1) Download the zip folder
2) Import Project in Tools(STS, vs code).
3) Build the project
4) Run the Project
Run as-> Spring boot app


## API 1: Get the Weather forecast summary of Any city using API (RapidApiGetForecastSummaryByLocationName)
in headers pass X-RapidAPI-Host = forecast9.p.rapidapi.com
and X-RapidAPI-Key = eb1fab039cmshe5bbf999bc4caf0p135a40jsnc12bcb123bd7
and pass json request body 



## API 2: Get hourly Weather forecast details of Any city using API (RapidApiGetHourlyForecastByLocationName)



follow the steps for output
1) step1: Use default issuer for access token {https://dev-64151434.okta.com/oauth2/default}
2) step2: For access token we need to set the authorization header a) type-> basic Auth b) username-> Client ID c) password-> CLIENT SECRETS
    in the body we need to enter the key and value
    After authorization header will be automatically generated when you send the request.


4)Access token
![227787690-243802b3-432b-41cc-9995-17437a3fcc87](https://user-images.githubusercontent.com/73180409/229243709-9fd45c59-25db-40a5-9a46-8e7739669784.png)

