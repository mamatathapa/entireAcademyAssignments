package com.entireAcademy.Day2.dataTypes;

public class DataTypesExercise {
    public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

        // ### EXAMPLE:
        int initialNumberOfBirds = 4;
        int birdsThatFlewAway = 1;
        int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
        System.out.println("1. " +remainingNumberOfBirds+ " birds are left on the branch.");
        System.out.println();

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

        // ### EXAMPLE:
        int numberOfBirds = 6;
        int numberOfNests = 3;
        int numberOfExtraBirds = numberOfBirds - numberOfNests;
        System.out.println("2. " +numberOfExtraBirds+ " more birds are there than nests.");
        System.out.println();

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
            int totalNumberOfRaccoons = 3;
            int racoonsThatEatDinner = 2;
            int racoonsLeftInWoods = totalNumberOfRaccoons - racoonsThatEatDinner;
            System.out.println("3. The number of raccoons left in the woods are " +racoonsLeftInWoods);
            System.out.println();

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
             int flowers = 5;
             int bees = 3;
             int leftBees = flowers - bees;
             System.out.println("4. " +leftBees+ " bees are less than flowers.");
             System.out.println();
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
            int numberOfPigeon  = 1;
            int numberOfPigeonJoined = 3;
            int totalPigeon = numberOfPigeon + numberOfPigeonJoined;
            System.out.println("5. " +totalPigeon+ " pigeons are eating breadcrumbs now.");
            System.out.println();
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
            int numberOfOwlsAtStart  = 3;
            int numberOfOwlsJoined = 2;
            int totalOwls = numberOfOwlsAtStart + numberOfOwlsJoined;
            System.out.println("6. " +totalOwls+ " owls are on the fence now.");
            System.out.println();
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
             int numberOfBeaversAtStart = 2;
             int numberOfBeaversLeft = 1;
             int totalBeaversStillAtHome = numberOfBeaversAtStart - numberOfBeaversLeft;
             System.out.println("7. " +totalBeaversStillAtHome+ " beavers are still working on their home.");
             System.out.println();
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
            int numberOfToucansAtStart = 2;
            int numberOfToucansJoined = 1;
            int totalToucans = numberOfToucansAtStart + numberOfToucansJoined;
            System.out.println("8. " +totalToucans+ " toucans in all.");
            System.out.println();
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
            int numberOfSquirrels = 4;
            int numberOfNuts = 2;
            int moreSquirrelsThanNuts = numberOfSquirrels - numberOfNuts;
            System.out.println("9. There are " +moreSquirrelsThanNuts+ " more squirrels than nuts.");
            System.out.println();
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
            int quarter = 1;
            int dime = 1;
            int nickel = 2;
            int quarterInCents =  quarter * 25;
            int dimeInCents = dime * 10;
            int nickelInCents = nickel * 5;
            int totalMoney = quarterInCents + dimeInCents + nickelInCents;
            System.out.println("10. She found " +totalMoney+ " cents.");
            System.out.println();
        /*
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
              int mrsBiersClass = 18;
              int mrsMacAdamsClass = 20;
              int mrsFlanneryClass = 17;
              int totalMuffins = mrsBiersClass + mrsMacAdamsClass + mrsFlanneryClass;
              System.out.println("11. " +totalMuffins+ " muffins first grade bake in all.");
              System.out.println();
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
                int yoyoCost = 24;
                int whistleCost = 14;
                int totalCostOfToys = yoyoCost + whistleCost;
                System.out.println("12. She spent " +totalCostOfToys+ " cents in all for the two toys");
                System.out.println();
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
                 int largeMarshmallows = 8;
                 int miniMarshmallows = 10;
                 int totalMarshmallows = largeMarshmallows + miniMarshmallows;
                 System.out.println("13. " +totalMarshmallows+ " were used in altogether.");
                 System.out.println();
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
                int snowInMrsHiltHouse = 29;
                int snowInBrecknockElementarySchool = 17;
                int moreSnow = snowInMrsHiltHouse - snowInBrecknockElementarySchool;
                System.out.println("14. Mrs. Hilt's house have "+moreSnow+ " inches more snow." );
                System.out.println();
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
                int totalMoneyMrsHiltHave = 10;
                int moneyForToyTruck = 3;
                int moneyForPencilCase = 2;
                int moneyMrsHiltHave = totalMoneyMrsHiltHave - moneyForToyTruck - moneyForPencilCase;
                System.out.println("15. Mrs. Hilt have $"+moneyMrsHiltHave+ " left." );
                System.out.println();
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
                int totalMarbles = 16;
                int lostMarbles = 7;
                int marblesLeft = totalMarbles -lostMarbles;
                System.out.println("16. Josh has "+marblesLeft+ " now." );
                System.out.println();
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
                int numberOfSeashells = 19;
                int totalSeashellsInCollection = 25;
                int neededSeashells = totalSeashellsInCollection - numberOfSeashells;
                System.out.println("17. Megan needs "+neededSeashells+ " more seashells to have 25 seashells in her collection." );
                System.out.println();
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
                int totalBalloons = 17;
                int redBalloons = 8;
                int greenBalloons = totalBalloons - redBalloons;
                System.out.println("18. Brad has "+greenBalloons+ " green balloons.");
                System.out.println();
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
                int booksOnTheShelf = 38;
                int addedBooks = 10;
                int totalBooksOnTheShelf = booksOnTheShelf + addedBooks;
                System.out.println("19. There are "+totalBooksOnTheShelf+ " on the shelf now.");
                System.out.println();
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
                int beeLegs = 6;
                int totalBees = 8;
                int totalLegsForEightBees = beeLegs * totalBees;
                System.out.println("20. 8 bees have "+totalLegsForEightBees+ " legs.");
                System.out.println();
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
              double iceCreamCone = 0.99;
              double costOfTwoIceCream = 2 * iceCreamCone;
              System.out.println("21. 2 ice cream cones cost $"+costOfTwoIceCream);
              System.out.println();


        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
                 int totalRocksNeeded = 125;
                 int rocksSheHas = 64;
                 int remainingRocksNeeded = totalRocksNeeded - rocksSheHas;
                 System.out.println("22. She needs "+remainingRocksNeeded+ " rocks to complete the border.");
                 System.out.println();
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
                int totalMarblesMrsHiltHave = 38;
                int lostMarble = 15;
                int remainingMarbles = totalMarblesMrsHiltHave - lostMarble;
                System.out.println("23. She have "+remainingMarbles+ " left.");
                System.out.println();
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
                int totalDistance = 78;
                int travelledDistance = 32;
                int remainingDistance = totalDistance - travelledDistance;
                System.out.println("24. They have "+remainingDistance+ " miles left to drive.");
                System.out.println();
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
                int timesSpentOnSaturdayMorning = 90;
                int timesSpentOnSaturdayAfternoon = 45;
                int timesSpentOnSaturdayAltogether = timesSpentOnSaturdayAfternoon + timesSpentOnSaturdayMorning;
                System.out.println("25. She spent total of "+timesSpentOnSaturdayAltogether+ " minutes shoveling snow.");
                System.out.println();
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
                 double numberOfHotDogs = 6;
                 double costOfHotDogs = 50;
                 double totalCostOfHotDogs = numberOfHotDogs * costOfHotDogs;
                 double costOfHotDogsInDollar = totalCostOfHotDogs / 100;
                 System.out.println("26. She pays $" +costOfHotDogsInDollar+ "for all of the hot dogs");
                 System.out.println();
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
                 int totalMoneyWithMrsHilt = 50;
                 int costsOfPencil = 7;
                 int numberOfPencils = totalMoneyWithMrsHilt % costsOfPencil;
                 System.out.println("27. " +numberOfPencils+ " pencils can be bought with the money she has.");
                 System.out.println();
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
                int totalButterflies = 33;
                int orangeButterflies = 20;
                int redButterflies = totalButterflies - orangeButterflies;
                System.out.println("28. " +redButterflies+ " butterflies were red.");
                System.out.println();
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
                 int moneyGivenToClark = 1;
                 int costOfCandyInCents = 54;
                 double costOfCandyInDollars =  costOfCandyInCents / 100;
                 double changeRemainingInDollar = moneyGivenToClark - costOfCandyInDollars;
                 System.out.println("29. Kate should get $" +changeRemainingInDollar+ " back.");
                 System.out.println();
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
                int initialTrees = 13;
                int platedTrees = 12;
                int totalTrees = initialTrees + platedTrees;
                System.out.println("30. He will have " +totalTrees+ " trees.");
                System.out.println();
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
                int daysToSeeGrandma = 2;
                int oneDayInHours = 24;
                int totalTimeInHours = daysToSeeGrandma * oneDayInHours;
                System.out.println("31. She sees her grandma in " +totalTimeInHours+ " hours.");
                System.out.println();
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
                int totalCousins = 4;
                int piecesOfGum = 5;
                int totalGumNeeded = totalCousins * piecesOfGum;
                System.out.println("32. She will need " +totalGumNeeded+ " pieces of gum.");
                System.out.println();
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double danTotalMoney = 3.00;
        double costOfCandy = 1.00;
        double danRemainingMoney = danTotalMoney - costOfCandy;
        System.out.println("33. $" +danRemainingMoney+ " is left.");
        System.out.println();

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int totalBoats = 5;
        int peopleInEachBoat = 3;
        int totalPeople = totalBoats * peopleInEachBoat;
        System.out.println("34. There are " +totalPeople+ " people on boats in the lake.");
        System.out.println();
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int totalLegos = 380;
        int lostLegos = 57;
        int remainingLegos = totalLegos - lostLegos;
        System.out.println("35. She have " +remainingLegos+ " now.");
        System.out.println();
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int totalMuffinsNeeded = 83;
        int bakedMuffins = 35;
        int remainingMuffins = totalMuffinsNeeded - bakedMuffins;
        System.out.println("36. " +remainingLegos+ " more muffins Arthur have to bake to have 83 muffins.");
        System.out.println();
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayonsWillyHas = 1400;
        int crayonsLucyHas = 290;
        int moreCrayons = crayonsWillyHas - crayonsLucyHas;
        System.out.println("37. Willy have " +moreCrayons+ " more crayons then Lucy.");
        System.out.println();
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersOnAPage = 10;
        int numberOfPages = 22;
        int totalStickers = stickersOnAPage * numberOfPages;
        System.out.println("38. I have " +totalStickers+ " stickers.");
        System.out.println();
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totalCupcakes = 96;
        int numberOfChildren = 8;
        double cupcakesEachWillGet = totalCupcakes / numberOfChildren;
        System.out.println("39. Each person will get " +cupcakesEachWillGet+ " cupcakes.");
        System.out.println();
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalGingerbreadCookies = 47;
        int numberOfCookiesInEachJar = 6;
        int numberOfCookiesLeft= totalGingerbreadCookies % numberOfCookiesInEachJar;
        System.out.println("40. " +cupcakesEachWillGet+ " cookies will not be placed in a jar.");
        System.out.println();
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int totalCroissants = 59;
        int numberOfNeighbors = 8;
        int numberOfCroissants= totalCroissants % numberOfNeighbors;
        System.out.println("41. " +numberOfCroissants+ " croissants will be left with Marian.");
        System.out.println();

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int totalOatmealCookies = 276;
        int numberOfCookiesInEachTray = 12;
        int numberOfTrays = totalOatmealCookies / numberOfCookiesInEachTray;
        System.out.println("42. " +numberOfTrays+ " will be needed to prepare 276 oatmeal cookies at a time.");
        System.out.println();

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int totalNumberOfPretzels = 480;
        int oneServingEquals = 12;
        int numberOfServingsInTotal = totalNumberOfPretzels / oneServingEquals;
        System.out.println("43. Marian was able to prepare " +numberOfServingsInTotal+ " servings of bite-sized pretzels.");
        System.out.println();
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int totalLemonCupcakes= 53;
        int numberLeftAtHome = 2;
        int cupcakesSheTook = totalLemonCupcakes - numberLeftAtHome;
        int numberOfCupCakesInEachBox = 3;
        int numberOfBoxes = cupcakesSheTook / numberOfCupCakesInEachBox;
        System.out.println("44. " +numberOfBoxes+ " boxes with 3 lemon cupcakes each were given away.");
        System.out.println();
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int totalCarrotSticks= 74;
        int numberOfPeople = 12;
        int carrotSticksUneaten = totalCarrotSticks % numberOfPeople;
        System.out.println("45. " +carrotSticksUneaten+ " carrot sticks were left uneaten.");
        System.out.println();
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int totalTeddyBear = 98;
        int teddyBearInEachShelves = 7;
        int totalFilledShelves = totalTeddyBear / teddyBearInEachShelves;
        System.out.println("46. " +totalFilledShelves+ " shelves will be filled");
        System.out.println();

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int totalPictures = 480;
        int pictureInEachAlbum = 20;
        int totalAlbumsNeeded = totalPictures / pictureInEachAlbum;
        System.out.println("47. " +totalAlbumsNeeded+ " will be needed if there are 480 pictures.");
        System.out.println();

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int totalTradingCards = 94;
        int maximumCardInEachBox = 8;
        int totalBoxFilled = totalTradingCards / maximumCardInEachBox;
        int totalCardsRemaining = totalTradingCards % maximumCardInEachBox;
        System.out.println("48. " +totalBoxFilled+ " boxes were filled.");
        System.out.println(totalCardsRemaining+ " cards are there in the unfilled box.");
        System.out.println();

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int totalBooks= 210;
        int numberOfShelves = 10;
        int numberOfBooks = totalBooks / numberOfShelves;
        System.out.println("49. " +numberOfBooks+ " books will each shelf contain.");
        System.out.println();


        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int totalCroissantsBakedByCristina= 17;
        int numberOfGuests = 7;
        int numberOfCroissantsServedToGuest = totalCroissantsBakedByCristina / numberOfGuests;
        System.out.println("50. Each guests will have " +carrotSticksUneaten+ "croissants");
        System.out.println();

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
        double totalAreaOfRoom = 12 * 14;
        double hourRateOfBill = totalAreaOfRoom / 2.15;
        double hourRateOfJill = totalAreaOfRoom /1.90;
        double totalHourRate = hourRateOfJill + hourRateOfBill;
        double timeTakenToPaintFiveRoom = 5 * totalAreaOfRoom / totalHourRate;
        double timeTakenToPaint623RoomWorking8HoursADay = (623 * totalAreaOfRoom / totalHourRate) / 8;
        System.out.println("It will take " +timeTakenToPaintFiveRoom+ " hours the pair to paint five rooms working together.");
        System.out.println("It will take " +timeTakenToPaint623RoomWorking8HoursADay+ " day the pair to paint 623 rooms assuming they work 8 hours a day.");
        System.out.println();



        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
        String firstName = "Mamata";
        String lastName = "Thapa";
        String middleInitial = "A";
        System.out.println(lastName+ ", " +firstName+ " " +middleInitial+ ".");
        System.out.println();


        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
            double distanceBetweenNewYorkAndChicago = 800;
            double distanceTravelledByTrain = 537;
            int percentageOfTheTripCompleted = (int) ((distanceTravelledByTrain / distanceBetweenNewYorkAndChicago) * 100);
            System.out.println(percentageOfTheTripCompleted+ "% of the trip has been completed");

    }

}
