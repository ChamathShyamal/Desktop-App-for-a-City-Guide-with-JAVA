-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2022 at 10:25 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smartcity`
--

-- --------------------------------------------------------

--
-- Table structure for table `city_data`
--

CREATE TABLE `city_data` (
  `id` int(11) NOT NULL,
  `Category` varchar(255) NOT NULL,
  `Sub_Category` varchar(255) NOT NULL,
  `Place_Name` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `City` varchar(255) NOT NULL,
  `Postal_Code` varchar(255) NOT NULL,
  `Website` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `city_data`
--

INSERT INTO `city_data` (`id`, `Category`, `Sub_Category`, `Place_Name`, `Description`, `City`, `Postal_Code`, `Website`) VALUES
(18, 'Education', 'Universities', 'Cardiff University', 'Cardiff University is a top five university for research excellence in a beautiful, student-friendly capital city. It  is a public research university in Cardiff, Wales.', 'Cardiff', 'CF10 3AT', 'https://www.cardiff.ac.uk/'),
(19, 'Education', 'Universities', 'Cardiff Metropolitan University', 'UK & Ireland University of the Year 2021', 'Cardiff', 'CF5 2YB', 'https://www.cardiffmet.ac.uk '),
(20, 'Education', 'Universities', 'University of Wales', 'The University of Wales is a confederal university based in Cardiff, Wales.', 'Cardiff', 'CF10 3NS', 'https://www.wales.ac.uk/en/Home.aspx'),
(21, 'Education', 'High Schools', 'Cathays High School', 'Inclusive school for all young people, families & colleagues?', 'Cardiff', 'CF14 3XG', 'https://www.cathayshigh.co.uk/'),
(22, 'Education', 'High Schools', 'Cardiff High School', 'Cardiff High School is a comprehensive school in the Cyncoed area of Cardiff, Wales.', 'Cardiff', 'CF23 6WG', 'https://www.cardiffhigh.cardiff.sch.uk/'),
(23, 'Education', 'High Schools', 'Cantonian High School ', 'Cantonian High School is an English-medium 11-18 community school maintained by Cardiff local authority.', 'Cardiff', 'CF5 3JR', 'https://www.cantonian.org/'),
(24, 'Education', 'Libraries', 'Cardiff Central Library ', 'Cardiff Central Library is the main library in the city centre of Cardiff, Wales.', 'Cardiff', 'CF10 1FL', 'https://en.wikipedia.org/wiki/Cardiff_Central_Library'),
(25, 'Education', 'Libraries', 'Penylan Library', 'Penylan Library and Community Centre provides library services offering a wide variety of books and computer access.', 'Cardiff', 'CF23 5HW ', 'https://www.digitalcommunities.gov.wales/locations/penylan-library/'),
(26, 'Education', 'Libraries', 'Cathays Library ', 'It is one of the 2,500 Carnegie libraries, financed by the American businessman Andrew Carnegie.', 'Cardiff', 'CF24 4PW', 'https://www.digitalcommunities.gov.wales/locations/cathays-library/'),
(27, 'Education', 'Coaching Centres', 'Pitman Training Cardiff ', 'Pitman training centre in Cardiff offers a wide range of certified diplomas, seminars and training courses in Cardiff.', 'Cardiff', 'CF10 1BS', 'https://www.pitman-training.com/our-centres/wales/cardiff/'),
(28, 'Education', 'Coaching Centres', 'ELITE Breakthrough Solutions ', 'Helps overthinking professionals breakthrough their self doubt to find inner calm & confidence', 'Cardiff', 'CF3 4JJ', 'https://elitebreakthrough.co.uk/'),
(29, 'Education', 'Coaching Centres', 'Moving Minds Coaching ', 'Aligning the body and mind is the first stepping stone on this journey.', 'Cardiff', 'CF5 2EG', 'https://www.movingmindscoaching.com/'),
(30, 'Jobs', 'Engineering', 'Regal Gaming Technologies ', 'Field Service Engineer ', 'Cardiff', 'CF25', 'https://uk.indeed.com/jobs?q=engineering&l=Cardiff%2C+Cardiff&vjk=2782a7ea4d8a9b94&advn=8400892037967608'),
(31, 'Jobs', 'Engineering', 'Optec', 'Network and Security Engineer', 'Cardiff', 'CF25', 'https://uk.indeed.com/jobs?q=engineering&l=Cardiff%2C+Cardiff&vjk=5144a01f52c274b3&advn=6067987154973606'),
(32, 'Jobs', 'Arts', 'Morphe', 'Seasonal Beauty Artist ', 'Cardiff', 'CF10', 'https://uk.indeed.com/jobs?q=art&l=Cardiff%2C+Cardiff&vjk=c3ae35172eed9c2d'),
(33, 'Jobs', 'Arts', 'Stagecoach Watford', 'Performing Arts Teacher ', 'Cardiff', 'Freelance', 'https://uk.indeed.com/jobs?q=art&l=Cardiff%2C+Cardiff&vjk=2aca4cc21e62f0b2&advn=140405677197822'),
(34, 'Jobs', 'Designing', 'Jottnar', 'Graphic Designer ', 'Cardiff', 'CF24', 'https://uk.indeed.com/jobs?q=art&l=Cardiff%2C+Cardiff&vjk=e0c976d1d60b23d9&advn=2503240387282629'),
(35, 'Jobs', 'Designing', 'Cardiff Games Studio', 'UI/UX Designer - Video Games ', 'Cardiff', 'CF13', 'https://uk.indeed.com/jobs?q=designer&l=Cardiff%2C+Cardiff&vjk=db74a1c126175abf'),
(36, 'Jobs', 'Business, management & administration', 'Quinn Consulting', 'Management Trainee ', 'Cardiff', 'CF14', 'https://uk.indeed.com/jobs?q=business+management&l=Cardiff%2C+Cardiff&vjk=e594b95bde50cdc1&advn=2855596580456930'),
(37, 'Jobs', 'Business, management & administration', 'Sonex Financial', 'Systems Administrator ', 'Cardiff', 'CF10', 'https://uk.indeed.com/jobs?q=business+management&l=Cardiff%2C+Cardiff&vjk=41e7244a606e7c2a&advn=3816892520495253'),
(38, 'Jobs', 'Science & Technology ', 'Jennifer Griffiths Recruitment and Training Ltd', 'Computer Science Teacher ', 'Cardiff', 'CF14', 'https://uk.indeed.com/jobs?q=science&l=Cardiff%2C+Cardiff&vjk=95f4187c7bb84f65'),
(39, 'Jobs', 'Science & Technology ', 'Varsity Tutors', 'A Level Biology UK Tutor ', 'Cardiff', 'CF16', 'https://uk.indeed.com/jobs?q=science&l=Cardiff%2C+Cardiff&vjk=cd7906d62a17dc13&advn=6635882904899227'),
(40, 'Jobs', 'Science & Technology ', 'Varsity Tutors', 'A Level Sports Science UK Tutor ', 'Cardiff ', 'CF24', 'https://uk.indeed.com/jobs?q=science&l=Cardiff%2C+Cardiff&vjk=d1a670e4ed4cd583&advn=6635882904899227'),
(41, 'Jobs', 'Science & Technology ', 'Flexicare Group Limited', 'IT Support Technician ', 'Cardiff', 'CF24', 'https://uk.indeed.com/jobs?q=technology&l=Cardiff%2C+Cardiff&vjk=ec121526e6dcdd2f&advn=4103524258236664'),
(42, 'Jobs', 'Repair & Maintenance', 'Homes for Students', 'Maintenance Operative ', 'Cardiff', 'CF24', 'https://uk.indeed.com/jobs?q=Repair+%26+Maintenance&l=Cardiff+&vjk=55b1ddcc62112c28'),
(43, 'Jobs', 'Repair & Maintenance', 'McDonalds Limited', 'Maintenance Person ', 'Cardiff', 'CF14', 'https://uk.indeed.com/jobs?q=Repair&l=Cardiff+&vjk=5e08313a68dc9e29'),
(44, 'Jobs', 'Agricultural', 'Sedgwick', 'Claims Handler - Agricultural and Rural Network ', 'Cardiff', 'CF3', 'https://uk.indeed.com/Agricultural-jobs-in-Cardiff?aceid=&gclid=CjwKCAiA68ebBhB-EiwALVC-NmUmil6wDY3LfxK94w6C3sjV2ugkE9iPwl0bEQ0Unvasn1IorPIYexoC83UQAvD_BwE&vjk=d73fede55314d042'),
(45, 'Jobs', 'Agricultural', 'Natural Resources Wales', 'Water Advisor ', 'Cardiff', 'CF2', 'https://uk.indeed.com/jobs?q=farming&l=Cardiff%2C+Cardiff&vjk=ce0c8f7a3260c495'),
(46, 'Jobs', 'Government', 'Cardiff Council', 'Social Worker ', 'Cardiff', 'CF10 4UW', 'https://uk.indeed.com/jobs?q=Government&l=Cardiff&radius=50&from=sug&vjk=fb807ecfb3028f6d'),
(47, 'Jobs', 'Government', 'Cardiff Council', 'CORPORATE TRAINEE - CUSTOMER SERVICES REPRESENTATIVE ', 'Cardiff', 'CF10 4UW', 'https://uk.indeed.com/jobs?q=Government&l=Cardiff&radius=50&from=sug&vjk=dfa69f93b05d936a'),
(48, 'Jobs', 'Health & Medicine', 'Cardiff and Vale University Health Board', 'Head of Quality and Clinical Governance ', 'Cardiff', 'CF14', 'https://uk.indeed.com/jobs?q=health+and+medicine&l=Cardiff&vjk=4e7935deddcddb2c'),
(49, 'Jobs', 'Health & Medicine', 'Public Health Wales NHS Trust', 'Head of Public Health Genomics Programme ', 'Cardiff', 'CF10', 'https://uk.indeed.com/jobs?q=health+and+medicine&l=Cardiff&vjk=02549d4f76ac3d94'),
(50, 'Jobs', 'Law', 'Ministry of Justice', 'Crown Court Clerk ', 'Cardiff', 'CF10', 'https://uk.indeed.com/jobs?q=law&l=Cardiff&vjk=c3ed9808fcaa45c1'),
(51, 'Jobs', 'Law', 'Robertsons Legal', 'Secretary: Family Law ', 'Cardiff', 'CF24', 'https://uk.indeed.com/jobs?q=law&l=Cardiff&vjk=350c26662c8bd1ea'),
(52, 'Jobs', 'Sales ', 'BMW Group Retail', 'Used Car Sales Executive ', 'Cardiff', 'CF20', 'https://uk.indeed.com/jobs?q=sales&l=Cardiff&vjk=5cbdcd24007daab2'),
(53, 'Jobs', 'Sales ', 'Hunter Selection', 'Sales Executive ', 'Cardiff', 'CF13', 'https://uk.indeed.com/jobs?q=sales&l=Cardiff&vjk=2491bd8aef237fef'),
(54, 'ATM', 'Best Rated ', 'Lloyds Bank ', 'Wherever you want to get to in life, Lloyds Bank has a range of bank accounts and personal banking services to suit you.', 'Cardiff', 'CF24 3PJ', 'https://www.lloydsbank.com/'),
(55, 'ATM', 'Best Rated ', 'Halifax Bank', 'Apply today for bank accounts, savings accounts, ISAs, loans, mortgages, credit cards and more.', 'Cardiff', 'CF24 3RR', 'https://www.halifax.co.uk/'),
(56, 'ATM', 'Best Rated ', 'HSBC Bank', 'Digital bank Starling followed closely behind with 84 per cent of customers, while First Direct, HSBC internet-based retail banking division, boasted 83 per cent.', 'Cardiff', 'CF24 3YZ', 'https://www.hsbc.co.uk/'),
(57, 'ATM', 'Best Rated ', 'NatWest ', 'Offer a wide range of personal banking products that include bank accounts, mortgages, credit cards, loans and more', 'Cardiff', 'CF24 3UX', 'https://www.natwest.com/'),
(58, 'ATM', 'Best Rated ', 'Barclays Bank ', ' For personal banking, mortgages, savings, investments, ISA and credit cards.', 'Cardiff', 'CF24 3YR', 'https://www.barclays.co.uk/'),
(59, 'ATM', 'Good Rated ', 'TSB Bank', 'Services include Cash machine - 24 hour service, Mortgage advisor and more', 'Cardiff', 'CF10 1GN', 'https://www.tsb.co.uk/personal/'),
(60, 'ATM', 'Good Rated ', 'Metro Bank ', 'A bank with stores that are open when it suits you, 7 days a week.', 'Cardiff', 'CF23 9AD', 'https://www.metrobankonline.co.uk/'),
(61, 'ATM', 'Good Rated ', 'Santander Bank', 'Santander Bank is a viable banking choice for many consumers.', 'Cardiff', 'CF10 2AF', 'https://www.santander.co.uk/'),
(62, 'Hotel', 'High Budget ', 'Hilton Cardiff ', 'The Hilton Cardiff Hotel offers guests an array of room amenities including a flat screen TV, air conditioning, and a refrigerator, and free internet access.', 'Cardiff', 'CF10 3HH', 'https://www.hilton.com/en/hotels/cwlhitw-hilton-cardiff/'),
(63, 'Hotel', 'High Budget ', 'Park Plaza Cardiff ', 'Park Plaza Cardiff is renowned for creating memorable moments through its inspiring service, stylish guest rooms and versatile meeting facilities.', 'Cardiff', 'CF10 3AL ', 'https://www.parkplazacardiff.com/'),
(64, 'Hotel', 'High Budget ', 'Clayton Hotel Cardiff ', 'With a stylish bar and restaurant, Clayton Hotel Cardiff offers modern rooms with free WiFi. ', 'Cardiff', 'CF10 1GD', 'https://www.claytonhotelcardiff.com/'),
(65, 'Hotel', 'High Budget ', 'Royal Hotel ', 'Set in a Grade II listed Victorian building hotel built in 1866, The Royal Hotel now boast modern features like rooms with air conditioning, an LCD TV and so on', 'Cardiff', 'CF10 1DW', 'https://royalhotelcardiff.com/'),
(66, 'Hotel', 'High Budget ', 'Holm House ', 'Holm House sits atop cliffs in Penarth, a town of gorgeous 19th-century architecture that Victorians dubbed The Garden by the Sea.', 'Cardiff', 'CF64 3BG', 'https://www.holmhousehotel.com/'),
(67, 'Hotel', 'Cheap', 'Travelodge Cardiff Atlantic Wharf ', 'The Travelodge Cardiff Atlantic Wharf is by the centre of the Welsh capital and close to the city docks.', 'Cardiff', 'CF10 4JY', 'https://www.travelodge.co.uk/hotels/380/Cardiff-Atlantic-Wharf-hotel'),
(68, 'Hotel', 'Cheap', 'Travelodge Cardiff Whitchurch ', 'This hotel is fantastic! The free parking is a bonus and Owen at check in was very welcoming and helpful. The room was nice and clean with no faults at all.', 'Cardiff', 'CF14 6BH', 'https://www.travelodge.co.uk/hotels/450/Cardiff-Whitchurch-hotel'),
(69, 'Hotel', 'Cheap', 'Sleeperz Hotel Cardiff ', 'Sleeperz Hotel Cardiff is a shining example of our vision for city centre hotels. With 74 stylish compact rooms at great value prices', 'Cardiff', 'CF10 1RH', 'https://www.sleeperz.com/cardiff/'),
(70, 'Hotel', 'Cheap', 'Premier Inn Cardiff City Centre Hotel ', 'The three star Premier Inn Cardiff City Centre is situated close to all the sights and attractions of the Welsh capital.', 'Cardiff', 'CF10 2HE', '(https://www.premierinn.com/gb/en/hotels/wales/glamorgan/cardiff/cardiff-city-centre-queen-street.html'),
(71, 'Hotel', 'Cheap', 'Cardiff Sandringham Hotel ', 'The Sandringham Hotel is a well established family run Hotel with good service and friendly atmosphere.', 'Cardiff', 'CF10 1PL', 'https://www.sandringham-hotel.com/)'),
(72, 'Industries', 'Energy', '2 Degrees Kelvin Ltd ', '2DegreesKelvin is an award winning, solar engineering company with a mission to make solar better.', 'Cardiff', 'CF14 6LW', 'https://www.2degreeskelvin.org/'),
(73, 'Industries', 'Energy', 'Syrus Energy Limited ', 'Syrus Energy Limited is an active company located in Cardiff, South Glamorgan', 'Cardiff', 'CF10 4LN', 'http://www.syrusenergy.com/'),
(74, 'Industries', 'Energy', 'Solaris Wales ', 'Help people decide which solar PV systems are best for them to help them reduce their electricity bills.', 'Cardiff', 'CF10 2HE', 'https://www.solariswales.com/mainpage/'),
(75, 'Industries', 'Automobiles ', 'Automotive Cardiff Ltd ', 'Our mechanic repairs, car servicing, car brakes exhausts, DPF repair. Our garage is just off Newport Road.', 'Cardiff', 'Cardiff CF23', 'https://www.automotivecardiff.co.uk/'),
(76, 'Industries', 'Automobiles ', 'Trade Centre Wales ', 'The award winning and largest independent used car supermarket in the U.K', 'Cardiff', 'CF45 4XA', 'https://www.thetradecentrewales.co.uk/'),
(77, 'Industries', 'Automobiles ', 'FPS Distribution Cardiff ', 'Distribution and wholesaling for over 80 years with a product portfolio that now spans the Automotive, Travel & Leisure, Maintenance & Accessories and Retail sectors.', 'Cardiff', 'CF24 5JT', 'https://fpsdistribution.com/distribution-centre/369/fps-cardiff/'),
(78, 'Industries', 'Electrical', 'Alan Wilson & Co ', 'Family run Electrical Wholesalers since 1968, providing you with quality products at reasonable prices', 'Cardiff', 'CF5 1HB', 'https://www.awelectrical-cardiff.co.uk/'),
(79, 'Industries', 'Electrical', 'ARB Electrical Ltd ', 'Cover across South Wales serving both commercial and domestic customers.', 'Cardiff', 'CF14 7AG', 'https://www.arbelectricalltd.co.uk/'),
(80, 'Industries', 'Electrical', 'Electric Center ', 'Electric Center stocks an expanding range of electrical equipment and accessories, providing electrical contractors and installers', 'Cardiff', 'CF24 5HF', 'https://www.electric-center.co.uk/'),
(81, 'Industries', 'Machinery', 'Emgla Vint Ltd', 'Offers a wide range of high-quality, new construction and industrial equipment.', 'Cardiff', 'CF24 4AB', 'http://emglavint.com/'),
(82, 'Industries', 'Machinery', 'Machine Mart Cardiff ', 'Specialist chain supplier of branded tools & equipment for DIY, building & home improvement.', 'Cardiff', 'CF24 3DN', 'https://www.machinemart.co.uk/stores/cardiff/'),
(83, 'Industries', 'Machinery', 'Applied Automation ', 'Leading suppliers of automation and control solutions, systems and products for manufacturing, marine and smart homes with specialist operating divisions.', 'Cardiff', 'CF24 5PG', 'https://www.appliedautomation.co.uk/'),
(84, 'Industries', 'Apparel', 'Art Apparel Ltd ', 'Clothes and fabric manufacturer in Caerphilly, Wales', 'Cardiff', 'CF83 1BE', 'https://artapparels.com/'),
(85, 'Industries', 'Apparel', 'Cardiff Embroidery  ', 'Embroidery and garment-printing on casual clothing, workwear and sports gear.', 'Cardiff', 'CF11 8BA', 'https://cardiffembroidery.co.uk/'),
(86, 'Industries', 'Apparel', 'Industry Ink ', 'Industry Ink provides a comprehensive spectrum of direct to garment and vinyl printing services.', 'Cardiff', 'CF24 5HJ', 'https://www.industryinks.com/'),
(87, 'Industries', 'Logistics ', 'SCC Logistics Ltd ', 'Sameday courier and dedicated delivery services from SCC Logistics are a fast, flexible, wholly reliable and cost-effective solution', 'Cardiff', 'CF3 2EQ', 'https://scclogistics.co.uk/'),
(88, 'Industries', 'Logistics ', 'GE haulage Ltd ', 'Trucking company in Llanedeyrn, Wales', 'Cardiff', 'CF23 9JR', 'https://nicelocal.co.uk/cardiff/business/ge_haulage_ltd/'),
(89, 'Industries', 'Logistics ', 'TN28 Logistics ', 'TN28 Logistics (Moving company) is located in Wrexham, Wales, United Kingdom.', 'Cardiff', 'CF24 3RU', 'https://nicelocal.co.uk/cardiff/business/tn28_logistics/'),
(90, 'RentalAccomodations', 'High Budget ', 'Glendower House ', 'Glendower House is the ideal accommodation for any student in Cardiff to live in', 'Cardiff', 'CF10 3DJ', 'https://www.crm-students.com/cardiff/glendower-house/'),
(91, 'RentalAccomodations', 'High Budget ', 'Crown Place Cardiff ', 'Make yourself at home in our all-inclusive ensuite rooms, stylish self-contained studios and one-bed apartments.', 'Cardiff', 'CF10 3BE', 'https://www.collegiate-ac.com/uk-student-accommodation/cardiff/crown-place/'),
(92, 'RentalAccomodations', 'High Budget ', 'The West Wing ', 'Stylish student living in the heart of Cardiff', 'Cardiff', 'CF24 0JU', 'https://www.thisisfresh.com/cardiff/west-wing'),
(93, 'RentalAccomodations', 'Cheap', 'Shared House ', 'Double bed room, 3 lads and 2 girls who are all sport students and very sociable. ', 'Cardiff', 'CF24', 'https://www.spareroom.co.uk/flatshare/south_glamorgan/cathays/16476307'),
(94, 'RentalAccomodations', 'Cheap', 'Cosy Room ', 'A bond of one month’s rent will need to be paid alongside the 1st months rent before moving in.', 'Cardiff', 'CF11', 'https://www.spareroom.co.uk/flatshare/south_glamorgan/cardiff/16476600'),
(95, 'RentalAccomodations', 'Cheap', 'House Share ', 'Room to rent in shared house. All bills included and broadband. Full sky package.', 'Cardiff', 'CF31', 'https://www.spareroom.co.uk/flatshare/mid_glamorgan/bridgend/15610979'),
(96, 'Resturants', 'High Budget ', 'The Ivy Cardiff', 'The Ivy Cardiff brings relaxed, sophisticated all-day dining to the heart of the capital.', 'Cardiff', 'CF10 1GA', 'https://theivycardiff.com/'),
(97, 'Resturants', 'High Budget ', 'Da Iawn Steakhouse', 'Brilliant food and brilliant service.', 'Cardiff', 'CF24 3PE', 'https://www.daiawncardiff.co.uk/'),
(98, 'Resturants', 'High Budget ', 'The Potted Pig ', 'Modern British cuisine with French and New York influences served in underground former bank vaults.', 'Cardiff', 'CF10 1PU', 'http://www.thepottedpig.com/'),
(99, 'Resturants', 'High Budget ', 'Le Monde Restaurant Cardiff ', 'Brasserie and wine bar with a fresh fish counter in a 19th-century warehouse with art deco styling.', 'Cardiff', 'CF10 1FE', 'https://le-monde-restaurant.co.uk/'),
(100, 'Resturants', 'High Budget ', 'Chapel 1877 Bar & Restaurant', 'Swish Welsh restaurant and bar/bistro in restored, exhuberantly-decorated and ornate former chapel.', 'Cardiff', 'CF10 2WF', 'https://www.chapel1877.com/'),
(101, 'Resturants', 'Cheap', 'Fresh the Baguette Bar ', 'The tiny Cardiff sandwich shop sees daily queues and was named among the top places to eat in the world this week.', 'Cardiff', 'CF10 1AE', 'https://www.tripadvisor.co.uk/Restaurant_Review-g186460-d6935111-Reviews-Fresh_the_Baguette_Bar-Cardiff_South_Wales_Wales.html'),
(102, 'Resturants', 'Cheap', 'Nant Restaurant ', 'Nant Restaurant - Coleg y Cymoedd, Nantgarw, Cardiff', 'Cardiff', 'CF15 7QY', 'https://www.tripadvisor.co.uk/Restaurant_Review-g186460-d7742967-Reviews-Nant_Restaurant-Cardiff_South_Wales_Wales.html'),
(103, 'Resturants', 'Cheap', 'Bwyta Bwyd Bombai - 3B’s ', 'Family-owned restaurant serving traditional Indian street eats in an intimate, relaxed dining room.', 'Cardiff', 'CF10 1AX', 'https://www.tripadvisor.co.uk/Restaurant_Review-g186460-d11629724-Reviews-Bwyta_Bwyd_Bombai_3B_s-Cardiff_South_Wales_Wales.html'),
(104, 'Resturants', 'Cheap', 'The Hellenic Eatery ', 'The Hellenic Eatery is a Greek alternative restaurant located on a busy Crwys Road in the centre of Cardiff. ', 'Cardiff', 'CF24 4NQ', 'http://www.thehelleniceatery.co.uk/'),
(105, 'Resturants', 'Cheap', 'Calabrisella Canton ', 'Calabrisella Cardiff is an authentic Italian Cafe and Restaurant in Cardiff.\n', 'Cardiff', 'CF11 9ND', 'http://www.calabrisellacardiff.com/CalabrisellaCanton/'),
(106, 'Bars', 'High Budget ', 'The Alchemist Cardiff ', 'A creative cocktail bar and restaurant situated in Cardiff in Wales. Enjoy delicious cocktails and all-day dining!', 'Cardiff', 'CF10 1DY', 'https://thealchemist.uk.com/venues/cardiff/'),
(107, 'Bars', 'High Budget ', 'Lab 22 ', 'This cool, eclectically-styled cocktail bar & speakeasy also has a molecular food and drink menu.', 'Cardiff', 'CF10 1FG', 'http://www.lab22cardiff.com/'),
(108, 'Bars', 'High Budget ', 'Gin and Juice ', 'Old-world pub offering breakfast, brunch & sharing boards, plus a lengthy evening gin menu.', 'Cardiff', 'CF10 1BU', 'https://www.ginandjuice.com/'),
(109, 'Bars', 'High Budget ', 'The Dead Canary ', 'Eclectic cocktails are freshly prepared at this designer bar with a style harking back to the 1920s.', 'Cardiff', 'CF10 2FR', 'https://thedeadcanary.co.uk/'),
(110, 'Bars', 'High Budget ', 'Vermut ', 'Wine Bar. Experience Wales first ever Andalusian style bar', 'Cardiff', 'CF10 1EB', 'https://curadobar.com/vermut/'),
(111, 'Bars', 'Cheap', 'The Live Lounge ', 'Music bar with 4 performances a day from solo artists and bands from midday, with DJs until 4am.', 'Cardiff', 'CF10 3FA', 'https://thelivelounge.com/'),
(112, 'Bars', 'Cheap', 'Porters Cardiff ', 'Upbeat, happening bar featuring regular live music & entertainment, plus quiz nights.', 'Cardiff', 'CF10 2FE', 'http://www.porterscardiff.com/'),
(113, 'Bars', 'Cheap', 'Fuel Rock club ', 'Cardiffs only dedicated rock club.', 'Cardiff', 'CF10 1BR', 'https://www.fuelrockclub.co.uk/'),
(114, 'Bars', 'Cheap', 'Be At One ', 'Lively chain bar that serves sweet, sour and spicy cocktails, and offers mixing masterclasses', 'Cardiff', 'CF10 1FE', 'https://www.beatone.co.uk/cardiff'),
(115, 'Bars', 'Cheap', 'The Borough Arms ', 'We are a family run pub with low prices everyday', 'Cardiff', 'CF10 1AT', 'https://www.tripadvisor.co.uk/Attraction_Review-g186460-d8602759-Reviews-The_Borough-Cardiff_South_Wales_Wales.html'),
(116, 'CoffeeShops', 'High Budget ', 'Blossom Cafe', 'Blossom is a family run cafe with a strong ideology', 'Cardiff', 'CF24 3NZ', 'https://blossomcardiff.co.uk/'),
(117, 'CoffeeShops', 'High Budget ', 'The plan ', 'The Plan Cafe is a Gourmet Cafe for artisan coffee and food in Cardiff. A unique, unhurried, indepe.', 'Cardiff', 'CF10 1AF', 'https://theplancafecardiff.co.uk/#cakespastries-and-desserts'),
(118, 'CoffeeShops', 'High Budget ', 'Coffee Heaven  ', 'Comfy seats, clean tables, pleasant staff, good coffee and delicious cakes', 'Cardiff', 'CF10 1AB', 'https://www.tripadvisor.co.uk/Restaurant_Review-g186460-d3648208-Reviews-Coffee_Heaven-Cardiff_South_Wales_Wales.html'),
(119, 'CoffeeShops', 'High Budget ', 'KIN+ILK Pontcanna ', 'Kin means family, ilk is your kind. Operating sustainably, serve only specialty coffee and fresh, locally sourced food.', 'Cardiff', 'CF11 9HB', 'https://kinandilk.com/'),
(120, 'CoffeeShops', 'Cheap', 'Costa Coffee ', 'Costa is the Nations Favourite coffee shop and the largest and fastest growing coffee shop chain in the UK.', 'Cardiff', 'CF24 3RR', 'https://www.costa.co.uk/'),
(121, 'CoffeeShops', 'Cheap', 'Coffee a GoGo ', 'Coffee a GoGo is Cardiffs award winning independent artisan coffee and gourmet sandwich makers celebrating 10 years of Award Winning Sandwiches', 'Cardiff', 'CF10 3BE', 'https://www.coffeeagogo.co.uk/'),
(122, 'CoffeeShops', 'Cheap', 'Brodies Coffee Co ', 'Brodies Coffee Co is the smallest permanent coffee shop in Cardiff and has resided in the gardens for five and a half years.', 'Cardiff', 'CF10 3NP', 'https://brodiescoffee.co.uk/'),
(124, 'Transportation', 'Bus', 'Cardiff Bus', 'Carry 100,000 passengers every day on 3,000 journeys covering 27,000 miles. That’s an annual equivalent of going to the moon and back 20 times', 'Cardiff', 'Cardiff', 'https://www.cardiffbus.com/'),
(125, 'Transportation', 'Bus', 'City-Sightseeing ', 'City Sightseeing is an open-top, sightseeing tour bus operator.', 'Cardiff', 'Cardiff', 'https://city-sightseeing.com/en/88/cardiff'),
(126, 'Transportation', 'Rail', 'Great Western Railway', 'Great Western Railway is a British train operating company owned by FirstGroup that operates the Greater Western passenger railway franchise.', 'Cardiff', 'Cardiff', 'https://www.gwr.com/stations-and-destinations/destinations/trains-to-cardiff'),
(127, 'Transportation', 'Rail', 'Transport For Wales Rail ', 'Transport for Wales (TfW) was set up by Welsh Government in 2016 to oversee public transport in Wales. ', 'Cardiff', 'Cardiff', 'https://tfw.wales/?gclid=Cj0KCQiAyMKbBhD1ARIsANs7rEHMZBUTi5R0X5AM6tvggiPQ0LnpRrv9Nw7H5yw-K82i6K1WzsCTLB0aAtAYEALw_wcB'),
(128, 'Transportation', 'Cycling', 'NextBike', 'OVO Bikes provide an affordable, active, and sustainable way to roll to class, work or a cafe. And better yet, many universities offer students & staff discounted or completely free rides!', 'Cardiff', 'Cardiff', 'https://www.nextbike.co.uk/en/cardiff/universities/'),
(129, 'Transportation', 'Cycling', 'THE TAFF TRAIL ', 'The Taff Trail runs for 55 miles between Cardiff and Brecon along a mixture of riverside paths, railway paths and forest roads.', 'Cardiff', 'Cardiff', 'https://www.outdoorcardiff.com/walks/taff-trail/'),
(130, 'Transportation', 'Coaches', 'National Express ', 'Frequent, daily services straight to the heart of Cardiff', 'Cardiff', 'Cardiff', 'https://www.nationalexpress.com/en/destinations/cardiff?gclid=Cj0KCQiAyMKbBhD1ARIsANs7rEFOBu3P8uiZ3fRAvDDt9AESB42Y1hHgzTIM8QJLioXc1-s6wNnMsvcaArfWEALw_wcB&gclsrc=aw.ds'),
(131, 'Transportation', 'Coaches', 'Megabus', 'megabus is the market-leading value coach operator in England, Scotland and Wales, with the aim of making travel simple for customers. ', 'Cardiff', 'Cardiff', 'https://uk.megabus.com/city-guides/cardiff'),
(132, 'Transportation', 'Flights ', 'Cardiff Airport', '\n\nCardiff Airport is the busiest airport in Wales. It has been under the ownership of the Welsh Government since March 2013', 'Cardiff', 'CF62 3BD', 'https://www.cardiff-airport.com/'),
(133, 'Transportation', 'Flights ', 'Whizzard Helicopters', 'The flight takes you over the famous landmarks of the city', 'Cardiff', 'CF10 4LZ ', 'https://whizzardhelicopters.co.uk/product/cardiff-city-tour-r/'),
(134, 'Transportation', 'Flights ', 'CARDIFF HELIPORT ', 'The heliport cost £3.8 million to build and was the operating base for the South Wales Police helicopter.  ', 'Cardiff', 'CF10 4LZ ', 'https://www.cardiffheliport.com/'),
(135, 'Transportation', 'Taxies', 'St Davids Cars', 'Eevery day taxis', 'Cardiff', 'Cardiff', 'https://www.stdavidscars.com/'),
(136, 'Transportation', 'Taxies', 'Dragon Taxis', 'South Wales best local taxi & private hire company', 'Cardiff', 'Cardiff', 'https://www.dragontaxis.com/'),
(137, 'Transportation', 'Taxies', 'Premier  Taxis', 'https://www.dragontaxis.com/locations/premier-taxis-cardiff/', 'Cardiff', 'Cardiff', 'https://www.dragontaxis.com/locations/premier-taxis-cardiff/'),
(138, 'TouristAttractions', 'Natural Attractions', 'Bute Park ', 'It comprises 130 acres of landscaped gardens and parkland that once formed the grounds of Cardiff Castle.', 'Cardiff', 'CF10 3ER', 'https://bute-park.com/'),
(139, 'TouristAttractions', 'Natural Attractions', 'Victoria Park ', 'A Victorian park with lawns, flower borders, bandstand, playground, paddling pool and refreshments.', 'Cardiff', 'CF5 1EH', 'https://www.outdoorcardiff.com/parks/victoria-park/'),
(140, 'TouristAttractions', 'Historical', 'Cardiff Castle ', 'The original motte and bailey castle was built in the late 11th century by Norman invaders on top of a 3rd-century Roman fort.', 'Cardiff', 'CF10 3RB', 'https://www.cardiffcastle.com/'),
(141, 'TouristAttractions', 'Historical', 'National Museum Cardiff ', 'he museum is part of the wider network of Amgueddfa Cymru – National Museum Wales.', 'Cardiff', 'CF10 3NP', 'https://museum.wales/cardiff/'),
(142, 'TouristAttractions', 'Historical', 'Wales Millennium Centre ', 'Wales Millennium Centre is an arts centre located in the Cardiff Bay area of Cardiff, Wales. The site covers a total area of 4.7 acres.', 'Cardiff', 'CF10 5AL', 'https://www.wmc.org.uk/'),
(143, 'TouristAttractions', 'Entertainments', 'Llanishen Leisure Centre ', ' has a state of the art gym equipped with Technogym equipment and a functional area ', 'Cardiff', 'CF14 5EB', 'https://llanishen.cylex-uk.co.uk/company/llanishen-leisure-centre-14102993.html'),
(144, 'TouristAttractions', 'Entertainments', 'Escape Rooms Cardiff ', 'You & your team have just 60 minutes to escape one of our intense movie-inspired games in Cardiff.', 'Cardiff', 'CF10 1DY', 'https://www.escaperoomscardiff.co.uk/'),
(145, 'TouristAttractions', 'Art & Culture ', 'Norwegian Church Arts Centre ', 'Former 19th-century church with a cafe, a gallery & bay views, plus regular concerts & arts events.\n', 'Cardiff', 'CF10 4PT', 'https://www.norwegianchurchcardiff.com/'),
(146, 'TouristAttractions', 'Art & Culture ', 'Chapter Arts Centre ', '\nChapter hosts films, plays, performance art and live music, and includes a free art gallery, café and bars.', 'Cardiff', 'CF5 1QE', 'https://www.chapter.org/'),
(147, 'Theatres', 'High Budget ', 'Everyman Cardiff ', '\n96% of travellers recommend this experience. ', 'Cardiff', 'CF10 5BZ', 'https://everymantheatre.co.uk/'),
(148, 'Theatres', 'High Budget ', 'Showcase Cardiff Nantgarw ', 'Modern multiscreen cinema with digital projection and sound equipment, plus a custom party service.', 'Cardiff', 'CF15 7QX', 'https://www.showcasecinemas.co.uk/showtimes/showcase-cardiff-nantgarw'),
(149, 'Theatres', 'High Budget ', 'The Cinema at Tramshed ', 'The perfect space to hire for VIP screenings, or private events.', 'Cardiff', 'CF11 6QP', 'https://www.tramshedcardiff.com'),
(150, 'Theatres', 'High Budget ', 'ODEON Cardiff ', 'State-of-the-art chain cinema for blockbusters in 2-D or 3-D format, plus family and student deals.', 'Cardiff', 'CF10 4JY', 'https://www.odeon.co.uk/cinemas/cardiff/'),
(151, 'Theatres', 'High Budget ', 'The Red Dragon Centre theatre ', ' It was originally known as the Atlantic Wharf Leisure Village when it opened in August 1997.', 'Cardiff', 'CF10 4JY', 'https://thereddragoncentre.co.uk/venues/odeon/'),
(152, 'Theatres', 'Cheap', 'Premiere Cinema Cardiff ', 'Casual cinema screening current & classic films & offering popcorn & other snacks.', 'Cardiff', 'CF10 2HQ', 'https://cardiff.premierecinemas.co.uk/PremiereCinemasCardiff.dll/Page?p=2&m=mm'),
(153, 'Theatres', 'Cheap', 'Cineworld Cinema Cardiff ', 'Multiplex cinema chain showing the latest international blockbusters in 2D and 3D formats.', 'Cardiff', 'CF10 2EN', 'https://www.cineworld.co.uk/cinemas/cardiff/055#/buy-tickets-by-cinema?in-cinema=055&at=2022-11-14&view-mode=list'),
(154, 'Theatres', 'Cheap', 'Vue Cinema Cardiff ', 'All the latest mainstream movies are shown at this state-of-the-art chain cinema with family deals.', 'Cardiff', 'CF10 1LA', 'https://www.myvue.com/cinema/cardiff/whats-on'),
(155, 'Theatres', 'Cheap', 'Chapter Cardiff ', 'Chapter Arts Centre is an arts centre in Canton, Cardiff, Wales, opened in 1971.', 'Cardiff', 'CF5 1QE', 'https://www.chapter.org/'),
(156, 'HealthCare', 'Government Hospitals', 'St Davids Hospital ', 'St Davids Hospital is a health facility in Canton, Cardiff, Wales. It is managed by the Cardiff and Vale University Health Board.', 'Cardiff', 'CF11 9XB', 'https://cavuhb.nhs.wales/hospitals-and-health-centres/our-hospitals/st-davids-hospital/'),
(157, 'HealthCare', 'Government Hospitals', 'University Hospital of Wales ', 'University Hospital of Wales, also known as the Heath Hospital, is a major 1,000-bed hospital in the Heath district of Cardiff, Wales.', 'Cardiff', 'CF14 4XW', 'https://cavuhb.nhs.wales/hospitals-and-health-centres/our-hospitals/uhw/'),
(158, 'HealthCare', 'Government Hospitals', 'Cardiff Royal Infirmary ', 'Cardiff Royal Infirmary site plan & access to four ELMS. ', 'Cardiff', 'CF24 0JT', 'https://cavuhb.nhs.wales/hospitals-and-health-centres/our-hospitals/cardiff-royal-infirmary/'),
(159, 'HealthCare', 'Private Hospitals', 'Spire Cardiff Hospital ', 'Spire Cardiff Hospital is the largest, modern provider of private healthcare in Wales.', 'Cardiff', 'CF23 8XL', 'https://www.spirehealthcare.com/spire-cardiff-hospital/'),
(160, 'HealthCare', 'Private Hospitals', 'Nuffield Health Cardiff Bay Hospital ', 'Nuffield Health offer a long list of experienced consultants so you know you are in the hands of the experts.', 'Cardiff', 'CF11 0SN', 'https://www.nuffieldhealth.com/hospitals/cardiff-and-vale/cardiff-bay-hospital'),
(161, 'HealthCare', 'Private Hospitals', 'St Josephs Hospital ', 'Welcome to world class healthcare at one of the best equipped hospitals in the UK. 160 leading consultants, the latest and best diagnostic equipment', 'Cardiff', 'NP20 6ZE', 'https://www.stjosephshospital.co.uk/'),
(162, 'HealthCare', 'Pharmacies', 'Superdrug Pharmacy ', 'All medication is dispensed by a licensed Superdrug pharmacy.', 'Cardiff', 'CF24 3LN', 'https://www.superdrug.com/store/albany-road-cardiff'),
(163, 'HealthCare', 'Pharmacies', 'Boots', 'Boots is your one stop shop for all your health and beauty needs. The pharmacy at the heart of the store taking care of customers healthcare needs.', 'Cardiff', 'CF10 2RG', 'https://www.boots.com/stores/323-cardiff-queen-street-cf10-2rg'),
(164, 'HealthCare', 'Pharmacies', 'Central Pharmacy', 'Central Pharmacy provides a broad range of professional, high quality pharmacy services dedicated to improving the health and well-being of our customers.\n', 'Cardiff', 'CF24 3PA', 'http://www.centralpharmacyonline.co.uk/'),
(165, 'HealthCare', 'Dentals', 'Smart Smiles ', '\nMissing teeth, loose crowns and unstable dentures, all can lead to a lack of confidence in eating and smiling but Implants can help to solve all these problems.', 'Cardiff', ' CF82 7AA', 'https://www.smartsmiles.co.uk/the-team'),
(166, 'HealthCare', 'Dentals', 'Clifton Dental Care ', '\nCliftons highly skilled team includes principal dentist Dr. Chris Pryde who has over 27 years of extensive dentistry', 'Cardiff', 'CF24 1DG', 'https://www.cliftondental.co.uk/'),
(167, 'HealthCare', 'Dentals', 'Cathedral Dental Clinic ', '\nAn exclusive private and NHS dental clinic offering the latest in general dentistry, cosmetic dentistry, implants and orthodontic treatments.', 'Cardiff', 'CF11 9JD', 'https://cathedraldentalclinic.com/'),
(168, 'HealthCare', 'Surgeries ', 'The Penylan Surgery ', '\nThe surgery is situated in a fine, early 20th Century house, on the corner of Penylan Road and Kimberley Road, which has been extensively modernised ', 'Cardiff', 'CF23 5SY', 'https://www.penylansurgery.co.uk/'),
(169, 'HealthCare', 'Surgeries ', 'Signature Clinic ', '\nOffers cosmetic surgery procedures, non-surgical face and body treatments, hair restoration and hair transplants.', 'Cardiff', 'CF23 8RS', 'https://signatureclinic.co.uk/our-clinics/cardiff/'),
(170, 'HealthCare', 'Surgeries ', 'Roath House Surgery ', '\nQuick response from GPs and reception staff.', 'Cardiff', 'CF23 5RH', 'https://www.roathhousesurgery.com/'),
(171, 'AirlineReservation', 'High Budget ', 'Cardiff Aviation ', '\nCardiff Aviation was established in 2012 in the aircraft engineering hotbed of South Wales. ', 'Cardiff', 'CF62 3BD', 'enquiries@cwl.aero'),
(172, 'AirlineReservation', 'High Budget ', 'DragonFly', '\nThe aircraft are primarily based at Cardiff but can be positioned to whichever departure airport is the closest or most convenient to the client.', 'Cardiff', 'CF62 3BD', 'www.dragonflyac.com/'),
(173, 'AirlineReservation', 'High Budget ', 'Qatar Airways', '\nExperience the skies like never before with flights from Cardiff. Luxurious and spacious seating, renowned service', 'Cardiff', 'Cardiff', 'www.qatarairways.com'),
(174, 'AirlineReservation', 'High Budget ', 'Eastern Airways ', 'Made up of innovative architecture, historic buildings and Cardiff Bay, Cardiff is a city proud of its culture, history and language.\n', 'Cardiff', 'CF62 3BD', 'www.easternairways.com/'),
(175, 'AirlineReservation', 'Cheap', 'Hurtigruten', '\nGuests can choose from three package levels, with the highest level including more than the lowest.', 'Cardiff', 'Cardiff', 'www.hurtigruten.co.uk'),
(176, 'AirlineReservation', 'Cheap', 'Santas Lapland ', '\nDirect flights from Cardiff to Lapland. It is easy to see why Lapland is the home of Santa Claus.', 'Cardiff', 'CF62 3BD', 'www.santaslapland.com/'),
(177, 'AirlineReservation', 'Cheap', 'Ryanair ', '\nAlways find the cheapest fares to over 200 destinations in Europe with Ryanairs Fare Finder!', 'Cardiff', 'CF62 3BD', 'www.ryanair.com/gb/en/'),
(178, 'Shopping', 'High Budget ', 'Capitol Cardiff ', 'Capitol Centre is an indoor shopping centre in the city of Cardiff, Wales. Functioning as one of the citys retail malls', 'Cardiff', 'CF10 2HQ', 'https://en.wikipedia.org/wiki/Capitol_Centre,_Cardiff'),
(179, 'Shopping', 'High Budget ', 'St Davids Dewi Sant ', 'This is one of the principal shopping centres in the city centre of Cardiff, Wales.', 'Cardiff', 'CF10 2EF', 'https://stdavidscardiff.com/'),
(180, 'Shopping', 'High Budget ', 'Queens Arcade ', 'Home to a fantastic selection of big name brands and unique independent retailers.', 'Cardiff', 'CF10 2BY', 'https://www.queensarcadecardiff.co.uk/'),
(181, 'Shopping', 'High Budget ', 'Morgan Quarter ', '60 stores, including many independent boutiques, plus cafes inside a charming, Victorian-era arcade.', 'Cardiff', 'CF10 1AF', 'https://morganquarter.co.uk/'),
(182, 'Shopping', 'High Budget ', 'Castle Quarter Arcades ', 'The Castle Arcade is a shopping arcade in Cardiff, South Wales.', 'Cardiff', 'CF10 1BU', 'https://castlequarterarcades.co.uk/'),
(183, 'Shopping', 'Cheap', 'Royal Arcade', 'The Royal Arcade is a shopping arcade in Cardiff, South Wales. The Royal Arcade is the oldest arcade in Cardiff, being built in 1858', 'Cardiff', 'CF10 1AE', 'https://thecityofarcades.com/arcade/royal-arcade/'),
(184, 'Shopping', 'Cheap', 'Cardiff Bay Retail Park ', 'Tenants including: B&M, Pure Gym, TUI, Lidl, Home Bargains, The Food Warehouse, Argos, Boots, Pets at Home, Sports Direct, Wilko, Blacks, JD, McDonalds and Costa.', 'Cardiff', ' CF11 0JR', 'https://www.visitcardiff.com/highlights/cardiff-bay-retail-park/'),
(185, 'Shopping', 'Cheap', 'The Avenue Retail Park ', 'including part food, toys etc. Retailers include Home Bargains, Homebase,etc.', 'Cardiff', 'CF23 9AE', 'http://www.altumcapital.co.uk/project/avenue-retail-park-cardiff/'),
(186, 'Shopping', 'Cheap', 'Capital Retail Park ', 'At Capital Shopping Park you will find a wide range of superstores and convenient places to eat. Starbucks Store Info.', 'Cardiff', 'CF11 8AU', 'https://www.visitcardiff.com/highlights/capital-shopping-park/'),
(187, 'Shopping', 'Cheap', 'Cardiff Lifestyle Shopping Park ', 'Tenants include M&S Foodhall, Boots, Laura Ashley, Mountain Warehouse, DW Sports, Starbucks, Pets at Home and HomeSense.', 'Cardiff', 'CF14 5DY', 'https://completelyretail.co.uk/scheme/2305'),
(188, 'EmergencyHelpline', 'Police', 'Police Heddlu ', 'Our force is the largest in Wales and serves 42 per cent of the population.', 'Cardiff', 'CF3 4FD', 'https://www.south-wales.police.uk/'),
(189, 'EmergencyHelpline', 'Police', 'South Wales Police – Roath ', 'Our vision is to be the best at understanding and responding to our communities', 'Cardiff', 'CF24 1LY', 'south-wales.police.uk'),
(190, 'EmergencyHelpline', 'Police', 'Cardiff Bay Police Station ', 'Cardiff Bay Police Station is the South Wales Police Eastern Division area headquarters and custody suite, located on James Street, Cardiff, Wales.', 'Cardiff', 'CF10 5EW', 'https://www.policestationreps.com/Police_Stations/Cardiff-Bay-Police-Station.php'),
(191, 'EmergencyHelpline', 'Ambulance', 'St John Ambulance Cymru ', 'St John Ambulance Cymru provides first aid treatment, training, and transport for communities across Wales', 'Cardiff', 'CF24 5PB', 'https://www.sjacymru.org.uk/'),
(192, 'EmergencyHelpline', 'Ambulance', 'St John Cymru Wales Patient Transport Services ', 'As a leading provider of patient transport services in Wales we have been transporting patients throughout Wales, the UK and beyond for over twenty years.\n', 'Cardiff', 'CF5 3AU', 'https://www.dewis.wales/ResourceDirectory/ViewResource.aspx?id=27586'),
(193, 'EmergencyHelpline', 'Ambulance', 'Halfords Ambulance Service ', '\nWe provide the fastest medic service and wont let you down.', 'Cardiff', 'Cardiff', 'https://www.halfords.com/'),
(194, 'EmergencyHelpline', 'Fire Service', 'Cardiff Central Fire Station ', '\nWe are South Wales Fire and Rescue Service and our vision, mission and values are what drives our Service', 'Cardiff', 'CF24 2FL', 'http://www.firestations.org.uk/Station_Details.php?stn=Cardiff%20Central%20fire%20station&lat=51.480375&lon=-3.166278'),
(195, 'EmergencyHelpline', 'Fire Service', 'Roath Fire Station ', '\nRoath Fire Station is situated nearby to Nextbike - Newport Road ', 'Cardiff', 'CF23 9AN', 'http://www.firestations.org.uk/Station_Details.php?stn=Roath%20fire%20station&lat=51.49661106&lon=-3.145888858'),
(196, 'EmergencyHelpline', 'Fire Service', 'Ely Fire Station ', 'You can contact Ely Fire Station by phone using number 01443 232000\n', 'Cardiff', 'CF5 5BQ', 'https://en.wikipedia.org/wiki/File:Ely_Fire_Station,_Cowbridge_Road_West,_Cardiff.jpg'),
(197, 'EmergencyHelpline', 'Coastguard', 'Maritime & Coastguard Agency ', '\nCoastguards were also out and about on the streets of Cardiff supporting Cardiff Council and South Wales Police', 'Cardiff', 'CF24 5JW', 'https://www.gov.uk/government/organisations/maritime-and-coastguard-agency'),
(198, 'EmergencyHelpline', 'Coastguard', 'Penarth Coastguard Rescue Station ', '\nThe lifeboat was met on shore by HM Coastguard Penarth Rescue Team', 'Cardiff', 'CF64 5BP', 'https://governmentbuildings.co.uk/properties/view/42639'),
(199, 'EmergencyHelpline', 'Coastguard', 'Porthcawl Coastguard ', 'Porthcawl Coastguard Rescue Team covers from Kenfig River to Ogmore River', 'Cardiff', 'CF36 3HY', 'https://batodfoundation.org.uk/porthcawl-coastguard-18142837461657585505/'),
(200, 'EmergencyHelpline', 'Rescue Services', 'A1 Speedy Recovery ', 'At A1 Speedy Recoveries Limited we offer nothing but a 1st class service', 'Cardiff', 'CF3 2ER', 'https://a1speedyrecovery.co.uk/'),
(201, 'EmergencyHelpline', 'Rescue Services', 'Cardiff Rescue ', 'We are a happy, friendly team and would love you to come and visit us at the centre to see our fantastic facilities and all the waggy tails of our doggy guests.\n', 'Cardiff', 'CF10 4XZ', 'https://www.findatow.co.uk/member.asp?mID=317&p=Cardiff+Rescue+Ltd'),
(202, 'EmergencyHelpline', 'Rescue Services', 'K&A rescue ltd ', '\nK&A Rescue Ltd is an active company incorporated on 24 October 2021 with the registered office located in Cardiff, Mid Glamorgan.', 'Cardiff', 'CF15 7JD', 'https://suite.endole.co.uk/insight/company/13700161-k-a-rescue-ltd');

-- --------------------------------------------------------

--
-- Table structure for table `login_reg_table`
--

CREATE TABLE `login_reg_table` (
  `id` int(11) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `UserType` varchar(255) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `FromCountry` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Telephone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_reg_table`
--

INSERT INTO `login_reg_table` (`id`, `FirstName`, `LastName`, `UserType`, `Username`, `Password`, `Gender`, `FromCountry`, `Email`, `Telephone`) VALUES
(1, '', '', 'Admin', 'Admin', 'Admin123', '', '', '', ''),
(11, 'Sam', 'Wilson', 'Student', 'SamW', 'Sam12345', 'Male', 'Australia	', 'Sam@gmail.com', '07975777666'),
(12, 'Ana', 'Megan', 'Student', 'AnaMG', 'Megan888', 'Female', 'Canada		', 'Ana@gmail.com', '07975757621'),
(13, 'George', 'David', 'Tourist', 'GeorgeDD', 'George12', 'Male', 'France	', 'George@gmail.com', '07975927641'),
(14, 'Abi', 'Linda', 'Tourist', 'ALinda', 'Linda678', 'Female', 'Sri Lanka	', 'ABI@gmail.com', '07975456213'),
(15, 'Harry', 'Connor', 'JobSeeker', 'HarryCN', 'Harry111', 'Male', 'Japan	', 'Harry@gmail.com', '07975415747'),
(16, 'Lily', 'Mary', 'JobSeeker', 'Lil', 'Mary1234', 'Female', 'Poland	', 'Lily@gmail.com', '07975963124'),
(17, 'Roy', 'Lan', 'Businessman', 'RoyL', 'Roy12345', 'Male', 'Thailand	', 'Roy@gmail.com', '07975197223'),
(18, 'Eliz', 'Charlotte', 'Businessman', 'Eli', 'Eli55555', 'Female', 'Italy	', 'Charlotte@gmail.com', '07975213998'),
(23, 'Kristin', 'Henstle', 'Tourist', 'Kris', 'Kristin1', 'Female', 'Albania	', 'Kristin@gmail.com', '076666666666');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `city_data`
--
ALTER TABLE `city_data`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login_reg_table`
--
ALTER TABLE `login_reg_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `city_data`
--
ALTER TABLE `city_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;

--
-- AUTO_INCREMENT for table `login_reg_table`
--
ALTER TABLE `login_reg_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
