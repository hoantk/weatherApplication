System Requirement Tool and IDE：

1. JDK 1.8
2. IntelliJ IDEA
3. MySQL 5.6

-------------------------------------------------------------------------
Step 1: Setup database :

1. Create a user : root/secret
3. Create a new schema : weather
2. Run sql file in /Dump20180626.sql for create table and insert data

Step 2: How to run project :

1. Clone project from https://github.com/hoantk/weatherApplication.git
2. Import/Open project with IntelliJ IDEA
3. Wait Gradle build project
4. After finish, run WeatherApplication (Spring Boot Configuration)
5. Open browser, input http://localhost:8083
6. Click on Weather City link, the system will move to Weather Cities page

Business Workflow :

Weather Cities page

1.Page first load :
   - Only show search city textbox and search button.
   - Value of search city textbox is clear.

2.Search button click :

   - User does not input search city name, click on Search button

       --> System will show error : Please input search city name
       --> Data table is clear

   - User input search city name, click on Search button

       -->System will search correct city name in database (uppercase and lowercase is OK)
             --> If city name is not exist in database
                 --> Show message : Not match result data found

             --> If city name is exist in database
                 --> If found city list matches with search city name
                     --> For each city in city list
                      --> Call API of openweathermap base on cityId
                      (because have city with same name and country, but different city_id. If get current weather data base
                      on city name and country name, that is duplicate data. So get base on city_id will return correct data)
                       --> Check data get form openweathermap
                         --> If data is valid
                           --> Delete current weather data of city
                           --> Insert new current weather data of city
                     --> End each
                     --> Get all weather logs of city list

                --> If found only one city matches with search city name
                      --> Call API of openweathermap base on cityId
                      (because have city with same name and country, but different city_id. If get current weather data base
                      on city name and country name, that is duplicate data. So get base on city_id will return correct data)
                       --> Check data get form openweathermap
                         --> If data is valid
                           --> Delete current weather data of city
                           --> Insert new current weather data of city
                       --> Get all weather logs of city
                --> Show data in page

3. Delete button click
   - User search weather logs of city.
   - All data is shown in page
   - User click on any Delete button.
   - System will remove weather logs out of database
   - Return Weather Cities page with data table is empty