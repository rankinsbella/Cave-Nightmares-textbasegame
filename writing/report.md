# Project Report
# Group members Andrew Rankins Bell

  My motivation for wanting to create a text based game for my project stemmed
from my passion about video games overall. Every aspect of video games
fascinate me. From the level design to being able to create your own character
to forge one's own story. In being able to write the code to my own game, I have
a greater connection to the process of how ideas are mapped out and eventually
became something great. This is important to me because my roots stem from a life
filled with video games. Being able to pay homage to my love of video games made
me feel so much more invested in the completion of this project. It has also made
me aware of just how much of a challenge coding can be. The idea of creating a
survival game came from the game Minecraft. In Minecraft the player has to
survive a hostile world of monsters. The monsters of the Minecraft world helped me
to realize what my game play loop would be for my program. The game itself is very
open ended. I was inspired by that freedom and that influenced my program. The
user has choices that they can make which have vastly different consequences
associated with them.
  For my project, I first imported the classes that I thought would be the most
useful. Those classes include the random class and the scanner class. I also
created my own classes. Those classes being the player class, monster class and
my main class. In my main class I created new instances of the random class and
my scanner class. After I Initialized those methods, I had to create the narrative
of my game. Print-in statements were used extensively throughout the majority of
the program so I could create a custom scenario that the user/player would be
immersed in. One of the most important aspects of this program is that the player
feels that they are apart of the experience. I created the object player and I
gave the attributes: choice, name and health. This was stored in the player class
through making a constructor for the player object. I then had to make constructors
for the player's attacks and health so I would be able to return the amount of
health the player ultimately had left after their encounters. I used the get
method to call the health of the monsters and of the player whenever the player
and monster battled so the user would always know how much health they currently
have.
  For the monster class I first imported the random class. This class is important
the overall program because I use this class to create a spawn system for the
monsters throughout the game. I first Initialized the monster class using the
public modifier and stated my class variables of damage and type. I then created
a new instance of the random class. After I created a new instance of the random
class I then connected the monster to the random class using rand.nextInt. I
assigned a number to the random integer. I chose three because my program was to
include three variations of the monsters. Those being the zombie, skeleton, and
mutant rat. These variations were stored in an arraylist. I used an if else
statement to generate the monsters. I set each type of monster to a specific
number out of three including zero. For each monster type I assigned a specific
damage output so that the monsters would be more than just text with similar
outputs. I then created another constructor to use the method get. This allows me
to retrieve the type of monster to return to the main class. I utilized getdamage
and gettype to retrieve the data.
  The output of my program starts with text that provides the introduction of
the reason why the player would be exploring a cave and fighting different monsters.
The player is then instructed to select their gender and their name. The player
is then put into the game where they encounter their first monster.
The player is then presented with a custom scenario where they have to choose
between three different options. The first option Initializes the battle system.
The player attacks a monster for a specific amount of damage while the monster also
attacks the player. The second choice is to say a quick prayer. This introduces
a new scenario in which the player ultimately dies thus ending the game. The third
option is to run away. This option also introduces a new scenario where the player
has to run away while being chased by a shadowy figure. This leads back into the
loop where a new monster appears and the cycle starts over again. After every
encounter with monsters, the players health is displayed so the player can make
an informed decision about what to do next. The premise of this game is to see
how long a player can survive in this game. The loop of the game only ends if the
player chooses to pick the second choice of saying a quick prayer, or if the player's
health goes down to zero.
  The challenges that I faced during the completion of this project were vast.
Writing a program completely from scratch is a very new process for me. During
class time and labs we always had a partially complete program or nearly complete.
Working on something on this scale was daunting to say the least. I had little
confidence in my ability to work through this project. There was an intrinsic
motivation for me to want to complete this project. That being my love for video
games. Throughout my time with this project, I had a large amount of doubt as to
whether I would be able to create a functioning program. In particular, I had a
tremendous amount of trouble creating classes that would work collectively. It was
confusing connecting the classes together because the idea for the program evolved
as time when on. New elements had to be incorporated within my work for a better
overall experience. Working with loops also posed a challenge for me. The formating
of the various loops were confusing for me from the beginning of taking this class.
I spent a large amount of time trying to incorporate the while loop into my program
to act as the core gameplay loop. My trouble stems from not truly understanding
the format of the while loop. The if else statement also failed originally because
of simple errors of not properly closing my code.
  In retrospect, my project would have been so much more effective if I utilized the
vast amount of resources that were available to me. There were a lot of times where
instead of working through my frustration and seeking help with parts that I did
not understand, I would simply leave and postpone the work I needed help on. There
were elements of my project that I wanted to implement but either due to not having
a clear understand of how to implement different features or simply lacking the time
to do certain things, I was not able to do that particular thing. This project has
taught me that teamwork is incredibly important in this field. Being able to collaborate
with someone to share the load reduces overall stress and more can ultimately be
accomplished in a shorter amount of time. I am not too keen on working in a group
because I find with group work communication can be unpredictable at times. Working
independently felt rewarding because of the perseverance I showed throughout this
entire process but I would have had a less stressful experience working with other
people. The computer science field is a field that requires a lot of collaboration
and team effort to make robust products.
