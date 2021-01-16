# DebugDataBandits - City Simulation

Group Members - Atharva Kudrimoti, Jacob Rozenkrants, Aditya Surapaneni, Arnav Swami

## 5 Hour Challenge Self-Assessments

Below is the link to our 5 Hour Coding Challenge Self-Assessments.

[5 Hour Coding Challenge Self-Assessments](https://docs.google.com/document/d/1t3HyMfHYAdfMq5ExskkMa_yAuScE9bmNFl6bsYqzwdY/edit?usp=sharing)

## Summary

The purpose of our project is to utilize Events, Inheritance, & Databases in order to create a “city infrastructure”. This “city infrastructure” will include essential elements that individuals in a city would encounter on a daily basis, such as using a bank’s services, utilizing a calendar/scheduler to plan the day, implementing an attendance/grading system in a school, visiting a car dealership, etc. Our end goal is to have the user of our overall program be able to access these various utilities that entail the city so they can simulate the typical life in a city.

## Project Plan

Below is the link to our Google Document containing our Project Plan. Project Plan was created in Google Document for easy tracking of revision history, easy implementation of tables & bullet points, and ease of collaboration.

[Project Plan Link](https://docs.google.com/document/d/1SD-CuWtx4IgmEOpG97WEE2w6nvn8La3Yk7JviVUhdwo/edit?usp=sharing)

## Scrum Board

Click on "Projects" to view our Scrum Board.

## Scrum Team Goals for Week of Scrum Team Cards/Ticket Focus

- Aditya & Arnav will simplify the CarDealershipSimulator code, fix errors, & fix user commands that are not working.
- Aditya & Arnav will aim to finish CarDealershipSimulator.
- Atharva & Jacob will aim to finish BankingSystem.
- Atharva & Jacob will start on SchoolAttendanceSystem.

## References & Links

- To find the Scrum Cards for every Scrum Team member, go to the Scrum Board by clicking "Projects", & look in the "In Progress" column.
- [Link to CarDealershipSimulator - Aditya & Arnav Worked as a Pair on This Code](https://github.com/AdityaS1426/DebugDataBandits-CitySimulation/tree/main/src)
- [Provided Link for Evidence of Work for Jacob](https://github.com/AdityaS1426/DebugDataBandits-CitySimulation/tree/bank-init/.idea)
- [Provided Link for Evidence of Work for Atharva](https://github.com/AdityaS1426/DebugDataBandits-CitySimulation/tree/gradingsystemandattendance)

## How to Run CarDealershipSimulator - Aditya & Arnav
- Open IntelliJ.
- Click "Get From Version Control".
- On our GitHub Repository, click on the green "Code" button.
- Copy the link that appears.
- Paste it into the URL box in IntelliJ.
- Expand the SRC folder.
- Double-click on the "CarDealershipSimulator" Class. This is the Main Class of the program.
- Click on the first green arrow to the left of the code.
- Click "Run".
- IMPORTANT: Make sure to type "ADD" in order to add the cars from the TXT file to the program. If this is not done, the other commands won't work.
- ALSO IMPORTANT: When sorting or filtering a car, enter the command, & then press "L" to load the car list again. This list will display the appropriate sort or filter.
- The other commands are listed in the README.

## Commands for Car Dealership

FIRST NOTE: Type "ADD" first so that the cars can be added to the inventory.
SECOND NOTE: All of the commands must be typed in CAPITAL LETTERS.
SECOND NOTE: If you don't want to look at the README for the commands, simply type "HELP" so that the commands are visible in the "Run" box.
THIRD NOTE: After sorting or filtering, type "L" to list the cars so that the sorted/filtered list can be seen.

###### Basic Use

ADD - Add cars from the file to the program.

L - List the cars.

SALES - List the yearly sales.

SALES TEAM - List the sales team.

SALES TOPSP - List the top sales person.

SALES STATS - List the sales statistics.

Q - Quit the program.

###### Sorting

SPR - Sort by the price.

SSR - Sort by the safety rating.

SMR - Sort by the maximum range.

###### Filtering

FPR [Enter Min Price] [Enter Max Price] - Filter by the price.

FEL - Filter the electric vehicles.

FAW - Filter by drivetrain.

FCL - Clear the filters.

###### Transactions

BUY [Enter VIN] - Buy a car.

RET [Enter Transaction ID] - Return a car.

## How to Use the Bank - Atharva & Jacob

THIS PROGRAM IS NOT IN THE MAIN BRANCH, IT'S IN AN ALTERNATE BRANCH. PROGRAM WILL BE MOVED TO MAIN BRANCH WHEN FINAL TOUCHES ARE MADE.

The program should give you options of whether one wants to create, display, or select an account.
Press 1 - Create Account

Press 2 - Display Account

Press 3 - Select Account

Press 4 - Exit

If you choose to Select Account, you must type in the Account ID number as listed in the "Display Account" section.

After you select Account

Press 1 - Deposit

Press 2 - Withdraw (Can only be done if there's money in the account.)

Press 3 - Get Balance

## To find Atharva's Code, go to gradingattendancesystem branch.
