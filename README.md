# **Software Requirements Specification**

# **for**

# **Poker**

Olaniyi, Trevarthan

9/27/202

**Table of Contents**

**[1. Introduction](#_kj3tcpswoveq) 3**

[1.2 Document Conventions](#_c36j8cdflzpe) 4

[1.4 Project Scope](#_xakp4hdphg7w) 4

[1.5 References](#_mymwx9omztoz) 4

**[2. Overall Description](#_omx4jls3qy9x) 5**

[2.1 Product Perspective](#_u2k1julq3uvd) 5

[2.2 Product Features](#_h6ga5dex9qpc) 5

[2.3 User Classes and Characteristics](#_al75cetijhjf) 6

[2.4 Operating Environment](#_ze45aqy0ccgs) 6

[2.5 Design and Implementation Constraints](#_rgm80fniouvb) 6

[2.6 User Documentation](#_1s60d1ishwaq) 7

[2.7 Assumptions and Dependencies](#_to80k7gchz7g) 7

**[3. System Features](#_gzxihk8224mq) 7**

[3.1 Start Game](#_xw97g0jsas57) 7

[3.1.1 Description and Priority](#_4ivygttgx0n) 7

[3.2 Display Instructions.](#_59qvjpnzfo7c) 7

[3.3 Win a round/Lose a round](#_26rkfmeko19i) 8

[3.4 How to win the game](#_kw7iyy9xlfwy) 9

[3.5 End Game](#_2fm18sguk3sk) 9

[3.6 Quit Game](#_o0j92ma65nf2) 10

**[4. External Interface Requirements](#_vsw6cjnivrtl) 11**

[4.1 User Interfaces](#_dezrn45hgltg) 11

[4.3 Software Interfaces](#_cay6fh4tme9y) 11

[4.4 Communications Interfaces](#_8ydmcakdem3) 11

**[5. Other Nonfunctional Requirements](#_p19zbqobm2te) 11**

[5.1 Performance Requirements](#_2shgxuayy1ns) 12

[5.2 Safety Requirements](#_p610zbe3pmza) 12

[5.3 Security Requirements](#_wqytlev4aoar) 12

[5.4 Software Quality Attributes](#_b8l34fle7vb9) 12

**[6. Other Requirements](#_gjooph9jp6t6) 12**

Revision History

| **Name** | **Date** | **Reason For Changes** | **Version** |
| --- | --- | --- | --- |
|
 | 9/28/21 | Initial Release | 1.0 |
| | | | |

##
## **1. Introduction**

The software requirements (SRS) report describes Poker in detail. All specifications for project development are included in this document, along with detailed explanations. The purpose of this document will be described in this section, along with a list of abbreviations and definitions.

**1.1 Purpose**

The goal of this document is to provide a detailed description of the Poker game that will be designed and implemented. It will explain the system&#39;s purpose and features, its interface, how it will interact with external applications, and the constraints under which it must operate. This document will serve as a reference for the system&#39;s developers as well as stakeholders who are future computer poker developers and researchers in this field.

## **1.2 Document Conventions**

Poker was created before this documentation was written, so all of the requirements listed here have already been met. It is critical to keep this document up to date with any future requirements and to clarify its priority for consistency purposes, so that it can continue to be useful. This document outlines the project&#39;s requirements, and because Poker is already in place, some sections of it are written in the style of a manual.

**1.3 Intended Audience and Reading Suggestions**

The intended audience will be for the testers and the class as a whole. We highly recommend reading the SRS before playing and the instructions included within the program to learn how to play the game.

## **1.4 Project Scope**

This project&#39;s goal is to design Poker. The system will be divided into two sections: game components and artificial intelligence components.

The system&#39;s game component will not be implemented. This section&#39;s functionality is intended to be obtained from third-party software. The client software on which the game will be played is a game component part. This section will provide the necessary data for the artificial intelligence component. This data set contains all information about the game&#39;s current state. This component also includes a graphical user interface for third-party users to easily understand the behavior of the agents.

The artificial intelligence component, which is at the heart of the system, will decide what poker action to take based on the current game state. While deciding on the next action, it will interact with the game component. The artificial intelligence component&#39;s goal is to compare and analyze various types of computer poker algorithms.

## **1.5 References**

The following are some useful resources for understanding the problem definition and existing solutions, as well as guiding requirements analysis.

- Rubin, J. &quot;Computer poker: A review - Department of Computer Science.&quot; 2011.

[https://www.slideshare.net/GiovanniMurru/ai-strategies-for-solving-poker-texas-holdem](https://www.slideshare.net/GiovanniMurru/ai-strategies-for-solving-poker-texas-holdem)

- [http://www.computerhope.com/jargon/d/dropdm.htm](http://www.computerhope.com/jargon/d/dropdm.html)

##
## **2. Overall Description**

## **2.1 Product Perspective**

Poker is a computer program which will implement the card game Poker where the user will play against an AI player.

## **2.2 Product Features**

_The game is going to contain the following functions:_

_Start game:_

_This will start the game, ask the player on how much they want to wager for the starting bet, and then deal out cards._

_Display:_

_This will display the cards in the user&#39;s hand and the cards that are in the center that are revealed by the deal. Will also display the actions the user can choose from._

_Instructions on How to play:_

_Before starting a game, the user will have the option to read about the rules of Poker and how to interact with the GUI._

_Play the game:_

_The User is asked to enter a starting wager, and then the game deals out cards to both players and the game enters the betting round phase. In the betting round phase, the user is able to look at the cards dealt to them and the cards currently revealed in the central hand. They are given the option to raise their wager,call, hold and let the AI player go first, or fold and end the current game. Every time a round ends, another card is revealed in the central hand, and a new betting round starts. Once all cards in the central hand are revealed, the showdown round begins, where the players do one final wager._

_End game:_

_After the showdown round a winner will be determined and displayed on screen.The user can choose to rematch or quit the program._

## **2.3 User Classes and Characteristics**

The programming language that Poker runs on is JAVA. The language in Poker is English, and will require basic reading comprehension.

## **2.4 Operating Environment**

Since Poker is designed on JAVA, Poker will be able to be used anywhere Java can be compiled, and operating systems that can run Java.

## **2.5 Design and Implementation Constraints**

The use of a mouse is required in order to play the game.

## **2.6 User Documentation**

User documentation will be available for Poker.

## **2.7 Assumptions and Dependencies**

The players in this game will be the user against an AI player.

##
## **3. System Features**

## **3.1 Start Game**

## **3.1.1 Description and Priority**

The player enters a starting wager and the game begins.

Priority-High: The game needs to start in order to be played.

## **3.2 Display Instructions.**

**3.21.1 Description and Priority**

This is where the instructions will be for the game.

Priority: low- the player might not need the instructions to continue on with the game.

**3.2.2 Stimulus/Response Sequences**

1. Users will decide if they need to see the instructions by clicking on the instructions button on the GUI.

2. If the button is selected, the instructions will display on the screen.

**3.2.3 Functional Requirements**

_REQ-1: User must click on the Instructions button._

REQ-2: Instructions are displayed onto the screen.

## **3.3 Win a round/Lose a round**

**3.3.1 Description and Priority**

This is the end of the match and where a player is declared a winner.

Priority: High – Determines who wins and who receives wagers.

**3.3.2 Stimulus/Response Sequences**

1. Showdown Round finishes

2. The players&#39; hands are revealed and compared.

2.1 The player who has the highest value hand will receive the money wagered.

2.2 If there is a tie for the highest hand, the money wagered will be returned to each player.

**3.3.3 Functional Requirements**

_REQ-1: Both players reveal their hand._

_REQ-2: The hands are compared to each other._

_REQ-3: Player with the highest value hand will receive all the money wagered._

_REQ3.1: If there is a tie, the game will be declared a draw and the money wagered will be returned to the players._

## **3.4 How to win the game**

**3.4.1 Description and Priority**

This is where it is shown who won the game.

Priority: High – it will show the winner of the match.

**3.4.2 Stimulus/Response Sequences**

1. The game will end when the showdown round is over and the players&#39; hands are compared.

2. This is achieved by winning rounds, which is stated in section 3.6.

**3.4.3 Functional Requirements**

_REQ-1:_ having the best five-card hand in the showdown

_REQ-2:_ to persuade the remaining players to fold

## **3.5 End Game**

**3.5.1 Description and Priority**

This is when the User decides if they want to rematch the AI with a new wager or if they want to quit.

Priority: High – Player determines if the game should continue or not.

**3.5.2 Stimulus/Response Sequences**

1. The winner of the match is determined and displayed.

2. Once the winner is displayed, the user can choose to either play again or quit the program.

**3.5.3 Functional Requirements**

_REQ-1:The user and AI players&#39; hands are compared and whoever has the higher value hand is determined the winner and receives the money wagered._

_REQ-2: The user decides if they want to rematch or quit the game._

## **3.6 Quit Game**

**3.6.1 Description and Priority**

This is when the game is exciting.

Priority: High – the program needs to be exited at some point.

**3.6.2 Stimulus/Response Sequences**

1. Users must click the quit game button on the GUI.

2. The program will quit and exit.

**3.6.3 Functional Requirements**

_REQ-1: Users must decide they want to end the game at the end of a match._

_REQ-2: The program will quit and exit._

##
## **4. Management/Planning**

### **4.1 Estimation Plan**

COCOMO 1 Organic Model was used, as the team comprises 2 members with a deadline of the end of the semester.

Based on researching previous similar projects KLOC would be estimated to be around 1,500-2,000 Lines of Code

_Effort=2.4 \* 1.5^2.4 = 4.4_

_DevelTime=2.5 \* 4.4=11_

_PersonTime= 11/4.4= 2.7_

We estimate that programming the game state and the AI Player of the game will take the longest based on complexity.

### **4.2 Resource Acquisition Plan**

· _Test resources:_ JUnit Testing will be used to test the program in many ways, such as values to wagers bets bei correct, poker hands are read and registered correctly, and testing if AI Player makes the correct decisions.

### **4.3 Project Commitments**

| Commitment | Made By | Made To | Due Date | Comments |
| --- | --- | --- | --- | --- |
| Game State Class | Adam Trevarthan | Progress the Poker Game and trigger events(Starting the game, | 5/4 | |
| AI Player Class | Charlotte Oyani | Controls the decisions the AI Player makes during the game as well as their hand and wager | 5/4 | |
| Player Class | Adam Trevarthan | Class that keeps track of the player&#39;s total earnings, current wager, wins and losses, and hand. | 4/15 |
 |
| Card Class | Charlotte Oyani | Class that makes a card | 3/15 | Needs to be done before making Deck Class |
| Deck Class | Charlotte Oyani | Class that consists of a deck of cards | 3/15 |
 |

##


## **4.4 Work Plan**

Identify major progress milestones at sufficient granularity that tracking against these milestones will indicate whether significant deviations are taking place from the planned objectives. Early milestones provide visibility to see if the project is straying off course.\&gt;

Milestones are based on when a major part of the project is completed, for example the completion of the game state class would be considered a milestone. When a phase reaches its due date, that will also be considered a milestone, as it notifies us as to whether or not we are on schedule or not, if we are not, we will discuss what should be done to get the project back on course.

## **4.5 Control Plan**

The team members will hold a brief status report meeting every week, and a status evaluation would be triggered in situations where a milestone is met, a deadline has been reached, or a high priority issue has been identified.

### **4.6 Data Control Plan**

· Types of data to be managed: SRS Document, Poker Program, Meeting Documents, Contribution Documents,Gantt Chart

· Updates and revisions, as well as the project itself, will be done through GitHub in a project repository.

### **4.7 Schedule Control Plan**

We have made a Gnatt Chart that is the planned schedule for the entirety of the project. The Game State class and the AI Player class are estimated to be the most complex parts of the Poker Game based on research of projects similar to this.

![](RackMultipart20220221-4-kcp384_html_cf6cf1f5d4f88751.png)

### **4.8 Communication, Tracking, and Reporting Plan**

| Type of Communication | Communication Schedule | Typical Communication Mechanism | Who Initiates | Recipient |
| --- | --- | --- | --- | --- |
| Status Report | every Friday | Email | Adam | Charlotte |
| Schedule and Effort Tracking Report | weekly | email/Zoom | Project Manager | Program Manager |
| Project Review | monthly | face to face | Adam | Charlotte |
| Risk Mitigation Status | as mitigation actions are completed | email | responsible team member | Project Manager |
| Requirement Changes | as changes are approved | email/or Zoom | Either Team Member | affected Project Participants |

## **4.9. Issue Resolution Plan**

Issues will be documented and tracked as they occur on an issue tracking document, which will be sorted by priority. Priority will be given to issues that interfere with baseline requirements being met, and requirements changes.

## **4.9.1 Project Close-Out Plan**

Once the project is completed, a project retrospective/report will be done in the form of a presentation.

##
## **5 Technical Process Plans**

The technical planning process establishes a framework for defining the technical effort required to design, deploy and maintain the system, as well as providing essential quantitative inputs for program planning and life-cycle estimates. The cost estimates and risk evaluations that arise are critical in supporting milestone decisions, establishing a work plan against which

**5.1. Process Model**

The project will use agile planning and estimating techniques. Agile is a set of process models for developing software through cooperation amongst self managing cross-functional teams that are focused on iterative and incremental development. The Scrum model is the most widely used agile implementation.

![](RackMultipart20220221-4-kcp384_html_759161c12a9c8c24.png)

**5.2. Methods, Tools, and Techniques**

Poker was designed to run on Windows 10 with the use of a keyboard and mouse to play. Poker does not require an internet connection to play or and will have a small file size.

Version Control system used is GitHub

## **5.3. Configuration Management Plan**

_The team members would meet every week and talk about how to plan each phase and how it would be recorded.Using Gnatt Chart to record our progress._ We are going to be using a doubly linked list. Doubly linked list is used because when the game starts. The dealer deals two cards for itself. Then there&#39;s a search for whether the value the dealer has is less than 17. If it&#39;s less than 17, then the dealer draws another card and adds the value of the card to the total value of the initial pair. If it is still less than 17, there will be continuous addition until the value is greater than 21. We can achieve that with a loop. Otherwise, we look for a value in the linked list greater than 21. However, if it is higher than 17 or less than 21then we search for a player&#39;s value that is greater than dealer&#39;s value. If it is greater than 21 players wins. So also, if the value from the player is greater than the value from the dealer, the player wins. Furthermore, if player value is not greater than dealer value we check for equality. If it is, the dealer wins and if it is not, there&#39;s a tie. The whole of the game condition would be put in a while loop testing for whether the player wants to play another round of game or not.

It took 70% of the project effort, as there was preparation for the flow chart before the source code got written. There were updates done to the flowchart as a result of conditions that did not meet how the game was supposed to work.

## **5.5. Documentation Plan**

| Document | Template or Standard | Created By | Reviewed By | Target Date | Distribution |
| --- | --- | --- | --- | --- | --- |
| Gnatt Chart | | Adam Trevarthan | Charlotte Olaniyi | | |
| Scheduling | | Charlotte Olaniyi | Adam Trevarthan | | |

## **5.6. Process Improvement Plan**

_After the project and the presentation are completed and the grades are up, we meet up to discuss the next phase and how to complete the phase. Then we decide on what we need to improve on or change based on our previous grades in the other phase._

##
## **6. External Interface Requirements**

## **6.1 User Interfaces**

The system is a graphical user interface (GUI) software application that runs on a PC. To begin the game, the user clicks on the icon to open the application. Single-user software will be developed, and computers will serve as dealers. The software will prompt you for a user name as soon as it boots up. The user enters a name. The software will determine whether the entered username belongs to an existing user or a new user.

**6.2 Hardware Interfaces**

Poker was designed to run on Windows 10 with the use of a keyboard and mouse to play. Poker does not require an internet connection to play or and will have a small file size.

## **6.3 Software Interfaces**

Runs on Windows 10 and requires Java. Does not interact with any other software

## **6.4 Communications Interfaces**

The user will be required to type in the amount of money they want to wager as well as click what action they want to do via clicking somewhere on the GUI

##
## **7. Other Nonfunctional Requirements**

## **7.1 Performance Requirements**

No performance requirements of note.

## **7.2 Safety Requirements**

Do not play for an extended period of time.

## **7.3 Security Requirements**

N/A

## **7.4 Software Quality Attributes**

This software was made under standard working conditions.

##
## **8. Other Requirements**

Appendix A: Glossary

| AI | Artificial Intelligence |
| --- | --- |
| GUI | Graphical User Interface |
| SRS | Software Requirement Specification |
| UC | Use Case |
|
 |
 |

Appendix B: Analysis Models

![](RackMultipart20220221-4-kcp384_html_43dd2e7d52a3ceb9.png)

![](RackMultipart20220221-4-kcp384_html_9326466386ba9ed6.png)
