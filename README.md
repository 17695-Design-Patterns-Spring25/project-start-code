

# Ride’Omatic: Autonomous Vehicle Software Design
## Objectives
The objective of this project is to demonstrate your knowledge and skills in the following:
- Comprehension of the code and design of a given system
- Identification of software design problems in the given design
- Solving design problems using design patterns
- Refactoring existing code to appropriate design patterns
## Project background:
A software written for operating an autonomous vehicle called Ride’Omatic is described in the following sections. Ride’Omatic contains functionality to control the operations of the vehicle such as starting and stopping the vehicle, sensing surrounding obstacles, and communicating with other vehicles on the road, among other features. A skeleton structure of the first version of this software (a Minimum Viable Product – MVP) works well, however is not quite extensible and maintainable. It lacks many of the good design principles. The skeletal MVP does not support all the features described in the following section.

**Note:** The skeletal design/code in this case does not have the actual code to control a vehicle, communicate with other vehicle, control the engine and other parts of the vehicle. It only contains the overall design of the system.

Your task is to comprehend the existing design and code, identify portions that do not adhere to good design principles thereby resulting in significant redesign of the software as it evolves. You will need to then solve the design problems by incorporating appropriate design patterns and validate your new design by refactoring the code. You must ensure that the refactored code integrates well with the other parts of the code and the system works as well as it did before or even better.

The problems that you discover could be in the code supporting the features in the MVP or they could be to ease the development of the evolving software to support many ofthe features that are not implemented but are described in the next section. Your new design could also cater for future enhancements of the system, not described in the following section.

**Note:** You do not need to implement the actual code for voice control, touch screen remote control, communication with sensors, controlling the vehicle movements etc. Since the focus is on demonstrating your knowledge and skills on design patterns, stay focused on the basic design problems and solving them using mostly the GoF design patterns.

## Requirements of Ride’Omatic:
This section describes an incomplete set of requirements of RideO’matic (referred to as ‘The system’). As the requirements evolve, this document will be updated. The software supports the following features
1. **Starting the vehicle:** The system should be able to interact with the automobile system in the following ways to start the vehicle
a) Manual Start
b) Start with voice control
c) Start with touch screen input
d) Remote Control
The vehicle should start the car only after checking that it is safe to do so. For example check if all doors are securely closed, all passengers have secured their seat belts etc.
2. **Stopping the vehicle:** The system should be able to interact with the automobile system in the following ways to stop the vehicle
a) Manual Stop
b) Stop with voice control
c) Stop with touch screen input
d) Remote Control
3. **Sensing the surrounding:** The system should be able interact with the sensors placed on all sides of the vehicle for any obstacles including other vehicles, humans, barriers etc. and react accordingly.
○ For example, if the vehicle senses a barrier on the left, while turning left, it should steer the vehicle to avoid the barrier.

4. **Getting messages from other vehicles in proximity:** The system should be able to get messages from vehicles in proximity on any condition that requires the vehicle to take appropriate actions.
○ For example, if there is a vehicle breakdown a few meters ahead of the
vehicle, other vehicles in front would broadcast messages.

5. **Sending messages to other vehicles in proximity:** The system should be able to send messages to other vehicles in proximity on conditions that the vehicle senses. (Refer to the requirement above)

6. **Responding to alerts:** An alert is defined as some unforeseen circumstance that the sensors and other systems like the automobile system, traffic signal system encounter which require the vehicle to respond. The system should be able to respond to alerts from various sources and instruct the appropriate system to take actions. An example is if a human suddenly appears in ‘x’ distance away, in front of the vehicle, the sensor would send an alert to Ride’Omatic, which then will interact with the automobile system to apply brake to stop immediately.

7. **Reading traffic signals:** The system should be able to interact with the traffic signal system to read and interpret traffic signals and take appropriate actions. Some examples are as follows
○ Stop at Red signal, proceed when the signal is Green etc.
○ Should not turn left in a “no left turn’ sign etc.

8. **Reading road signals:** The system should be able to read and interpret road signs that are not updated in the navigation system and act accordingly. For example, there may be some temporary closure of a road due to road works etc.

9. **Navigating the vehicle:** The system should be able to interact with the navigation system to steer the vehicle according to the instructions given by the navigation system (such as Google Maps). The system should then interact with the automobile system to steer the vehicle. However, the system should also ensure that the conditions are right before relaying the instructions to the automobile system. For example, if the navigation system instructs to turn left, and the sensor indicates that there is an obstacle in the left, the vehicle should not turn left. Similarly, if the left-turn signal is red, the vehicle should wait until it is green.

10. **Reacting to messages from the automobile system:** The system should be able to receive messages from the automobile system and react appropriately. For example, if the vehicle is running low on fuel, it should instruct the navigation system to add a via point to the nearest fuel station before resuming the travel to the destination.
There could be other messages for which other actions need to be taken.

11. **Opening and closing the vehicle doors:** The system should be able to open
and close the vehicle doors using any of the following ways:
○ Voice commands
○ Touching the door handle
○ Remote control

12. **Adjusting and remembering the vehicle settings:** The system should provide for adjusting the seat, the mirrors, temperature etc. for an ‘x’ number of passengers individually. The system should be able to retrieve these settings each time the passenger travels in the vehicle.

13. Other features such as indicate when fuel is low, tire pressure is low, etc should
be handled by the system.

14. **Music Player:** The system should be able to do the following by interacting with
the music system:
○ Play, stop, forward, skip to the next media item etc. by voice command or by touching the music panel. A media item could be a song, talk, video etc. Media is stored in the media storage supported by the player.
○ Save the currently playing media item into the favorite media list.
○ Skip to the next media according to a specific category of media item (selected by the passenger) in the favorite media list. Media items are generally categorized by genres, artist etc. A favorite list may contain media items of different categories.

## Design of the Ride’Omatic system
Refer to the project documentation shared on canvas.


## Project Requirements:
This section describes what you need to do for the project.
 1. You will need to form teams of 3 students. Do let me or the TAs know if you have any
issues forming teams. Teams must be formed by 25 September 2024. You may go to
Canvas to self-enrol into a team.
 2. Give your team a nice name.
 3. You need to study the partial design described in the previous section and the partial code located in the starter code provided to you and comprehend the existing system. You may discuss the existing design as a team.
 4. **Each team member must do the following**
    a. Identify at least one design problem in the system (ensure that each team member identifies a different problem)
    b. Solve the design problems using the GoF design patterns. DO the following: 
    - Short list candidate patterns (candidate patterns) 
	- Analyze and compare the candidate patterns for the suitability to solve your identified problem. If you need more than one pattern to solve, study those as well.
	- Draw the modified class diagrams and sequence diagrams for one use case that includes your new solution.
    - Refactor the code to your chosen design patterns
	- Integrate the modified code with your team member’ modifications.
 6. **As a team, write a report that includes the following:**
a. Team name, team members names.
b. List of design problems identified with the team member’s name
c. For each design problem:
    - Describe the design problem in the context of the application.
Useful: describe how the existing design violates the design principles.
Describe at least one or two from the SOLID principle.
    - List the candidate design patterns
    - Justification of why you chose a particular candidate design pattern and why you did not choose the others. 
Useful: describe how your new design exhibits design principles.
Describe at least one or two from the SOLID principle.
    - Study the implementation issues described in the section on ‘Implementation’ in each pattern. Describe whether you are implementing according to any suggested implementation.
    - Describe the use case that you choose to show the problem and incorporation of the design pattern(s).
    - Original class and sequence diagram for the chosen use case. If it is not shown in this document, you will need to draw them. These diagrams will show how the design looks before incorporating the pattern(s).
    - Modified class and sequence diagrams for the chosen use case. These diagrams will show how the design looks after incorporating the pattern(s).

6. **Reflection of the course:** Each team member will submit a short reflection having the
following points:
a. How has your knowledge of software design been changed by attending this
class
b. How better could you have been prepared to learn more in this course
c. How could you have contributed to your peers’ learning journey?
d. How do you think this knowledge will be useful in your future career?
e. How could the course have been designed better or communicated better?

## Submission details

1. Use only JDK version 15 and above.
2. You may use any drawing tool to draw diagrams in UML notation.
The diagrams should be legible.
3. Use the GitHub Classroom repository you created for your team.
4. Upload your report and reflection to the Canvas folder in a pdf file with your name in the filename &lt;your CMU ID&gt;Report.pdf; &lt;your CMU ID&gt;Reflection.pdf
5. Deadline for submission: 10th October 2024
6. Late submission penalty:
1-2 day late: lose 3% of max
3 days late: lose 5% of max
&gt;3 days: not acceptable

## Rubrics for evaluation
You can score better if you do the following well:

1. Understand design principles in the context of the application
2. The identified design problem should be non-trivial in the context of the application. A good justification will be useful.
3. A good analysis of the candidate patterns is important. If you can select the most appropriate pattern without needing more than one candidate pattern, a justification should be documented.
4. Ensure that you follow the structure, attributes, relationships, and interactions between the participants of the patterns as prescribed in the GoF book. Document any deviations with justifications.
5. Describe the chosen implementation(s) suggested in the pattern, with justification.
6. In your modified code, include print statements to illustrate the salient points of the implemented design patterns.
7. In your modified code, give good names to the classes, methods, and attributes for the participants of the design patterns implemented.

8. Ensure that your code runs without errors. Make it simple for us to run your code. If it does not run for us, we will not be able to give you marks for this portion.

## Marking Scheme (Total: 25 points):
| Item                             | Points |
|----------------------------------|--------|
| Problem                          | 3      |
| Candidate patterns               | 2      |
| Choosing the pattern             | 3      |
| Modified Class diagram           | 3      |
| Modified sequence diagram        | 3      |
| Addressing Implementation issues | 2      |
| Modified Code for the pattern    | 3      |
| Execution of the application     | 4      |
| Reflection                       | 2      |
| **Total**                        | **25** |

***All the best***
***Redesign Refactor Retest and Rejoice***
