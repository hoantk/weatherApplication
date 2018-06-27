System Requirement Tool and IDE：

1. JDK 1.8
2. IntelliJ IDEA
3. MySQL 5.6

-------------------------------------------------------------------------
Step 1: Setup database:

1. Create a user : root/secret
3. Create a new schema : weather
2. Run sql file in /Dump20180626.sql for create table and insert data

Step 2: How to run project:

1. Clone project from https://github.com/hoantk/weatherApplication.git
2. Import/Open project with IntelliJ IDEA
3. Wait Gradle build project
4. After finish, run WeatherApplication (Spring Boot Configuration)
5. Open browser, input http://localhost:8083
6. Click on Weather City link, the system will move to Weather City page

Business Workflow for Weather City page

1.Page load:
   - Just only show search city textbox and search button.
   - Value of search city textbox is clear.

2.Search button click :
   - User does not input search city name, click on Search button
       + Data table is clear
   - User input search city name, click on Search button
       + System will search correct city name in database (both search uppercase and lowercase)
             + If city name is not exist in database
                 + Show message : Not match result data found
             + If city name is exist in database
                 + If found city list matches with search city name
                     + For each city in city list
                       + Call API of https://openweathermap.org/ base on city, country and apikey
                       + Delete current weather data of city
                       + Insert new current weather data of city
                     + End each
                     + Get all weather logs of city list
                 + If found only one city matches with search city name
                      + Call API of https://openweathermap.org/ base on city, country and apikey
                      + Delete current weather data of city
                      + Insert new current weather data of city
                      + Get all weather logs of city
                 + Show data in page
3. Delete button click
   - User search weather logs of city.
   - All data is shown in page
   - User click on any Delete button.
   - System show popup
   - If user click Delete button, system will remove weather logs out of database
   - If user click Cancel button, system will turn off popup
   - Return Weather City page with data table is empty