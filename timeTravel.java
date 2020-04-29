package mainWork;

import java.util.Random;

public class timeTravel {
    //public String s= new String("");

    public String mainTimeStory()
    {
        Random random=new Random();
        int back_or_forward = random.nextInt(2)%(2);

        System.out.println(back_or_forward);

        String s= new String("");
        s=back_story();
        return s;
    }

    public String back_story()
    {
        String backstory=new String("");

        String[][] history_war=
                {
                        {"Augustus","Macedonia","41B.C","was fighting against Cassius.","Cassius"},
                        {"Constantinus I", "Italy","312", "was in a duel near the Milvian bridge on the Tiber River.","another Augustus Maxentius"},
                        {"Genghis Khan", "Caspian Sea", "1218", "was following up a victory with hot pursuit.","The Khwarizm"},
                        {"Aléxandros III", "Granicus", "334B.C", "was marching to the East, prepare to fight the Persian army.","Persia"},
                        {"Ying Zheng", "Xian Yang", "225B.C", "was preparing to destroy six other vassals .","other weak vassals"},
                        {"Tolui Khan", "Khorasan", "1221", "was preparing to conquer Nishapur and Merv.","the British Empire, the United Kingdom of the Netherlands and the kingdom of Prussia"},
                        {"Justinianus I","Colchis","540","was preparing to address unequal relations with the Persian.","Shamanism Dynasty"},
                        {"Julius Caesar","Parthia","44B.C"," announced that he would go on an expedition to Parthia in order to save the nine thousand Roman soldiers captured in the battle of Carlyle.","Parthia"}

                };

        String[] identity=
                {
                        "Archaeology", "geology", "history"
                };

        String[] describe=
                {
                        "huge",
                        "great",
                        "magnificent",
                        "amazing",
                        "unique",
                        "special",
                        "amazing",
                        "imposing",
                        "sumptuous",
                        "splendid"
                };

        String[] architecture=
                {
                         "palace","temple","sculpture"
                };

        String[] weather=
                {
                        "rainstorm","dense fog","sandstorm","thunder storm","thunder storm and gale"
                };

        String[] decision=
                {
                        "refuse to get involved in the struggle",
                        "use what he knows to avoid the crisis",
                        "help the victorious side to rise in the official world",
                        "help the failed side to reduce the loss"
                };

        String[] names=
                {
                        "James",
                        "Robert",
                        "William",
                        "Thomas",
                        "Daniel",
                        "Matthew",
                        "Timothy",
                        "Scott",
                        "Raymond",
                        "Joshua"

                };

        Random random=new Random();
        int template = random.nextInt(7)%(7);

        int history_max=history_war.length;
        int identity_max= identity.length;
        int describe_max=decision.length;
        int architecture_max=architecture.length;
        int weather_max=weather.length;
        int decision_max=decision.length;
        int name_max=names.length;

        if(template==0)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max)%(history_max);
            int t2 = random.nextInt(identity_max)%(identity_max);
            int t3 = random.nextInt(describe_max)%(describe_max);
            int t4 = random.nextInt(architecture_max)%(architecture_max);
            int t5 = random.nextInt(weather_max)%(weather_max);
            int t6 = random.nextInt(decision_max)%(decision_max);
            int t7 = random.nextInt(name_max)%(name_max);

            backstory= names[t7]+", an UCD professor of "+identity[t2]+" woke up to find himself next to a "+
                    describe[t3]+" "+ architecture[t4]+". Some people in exotic clothes passed by him and spoke a language that he can't understand. " +
                    "He tried to communicate with others and learned that it is "+history_war[t1][1]+"AC. "+
                    "According to his knowledge, the king is "+history_war[t1][0]+"."+" He realised that his doctoral dissertation is related to this period. "+
                    "He concludes that it is in"+history_war[t1][2]+" and "+history_war[t1][0]+" "+
                    history_war[t1][3]+" The chance to change history is coming to him, and he decided to "+ decision[t6]+". "+
                    "The sudden " +weather[t5]+" made the last ray of sunshine disappear. This is a road without turning back."+
                    "To be continued......";
        }

        if(template==1)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max-1)%(history_max);
            int t2 = random.nextInt(identity_max-1)%(identity_max);
            int t3 = random.nextInt(describe_max-1)%(describe_max);
            int t4 = random.nextInt(architecture_max-1)%(architecture_max);
            int t5 = random.nextInt(weather_max-1)%(weather_max);
            int t6 = random.nextInt(decision_max-1)%(decision_max);
            int t7 = random.nextInt(name_max-1)%(name_max);

            backstory=names[t7]+ ", an "+identity[t2]+" professor of Stanford University, " +
                    "woke up and found himself beside a "+describe[t3]+" "+ architecture[t4]+". " +
                    "Some people dressed in foreign clothes passed by him, saying the language he did not understand. " +
                    "He tried to communicate with others and learned that here is "+history_war[t1][1]+". " +
                    "Now the ruler is "+history_war[t1][0]+", and his doctoral dissertation research is precisely related to this. " +
                    "He concluded that it was in "+history_war[t1][2]+" that "+history_war[t1][0]+" "+ history_war[t1][3]+" " +
                    "The chance to change history lies ahead of him. " +
                    "He decides to "+ decision[t6]+" " +
                    "The sudden "+weather[t5]+" blocked the last light. " +
                    "This is a road that can go on without turning back. "+
                    "To be continue...... ";
        }


        if(template==2)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max)%(history_max);
            int t2 = random.nextInt(identity_max)%(identity_max);
            int t3 = random.nextInt(describe_max)%(describe_max);
            int t4 = random.nextInt(architecture_max)%(architecture_max);
            int t5 = random.nextInt(weather_max)%(weather_max);
            int t6 = random.nextInt(decision_max)%(decision_max);
            int t7 = random.nextInt(name_max)%(name_max);

            backstory= names[t7]+", an "+identity[t2]+" professor of the University of Beijing, " +
                    "woke up to find next to a "+describe[t3]+ " "+ architecture[t4]+ ". " +
                    "In the desert, some merchants passed by occasionally. " +
                    "Through conversation, he learned that the current ruler is "+history_war[t1][0]+". " +
                    "Based on his research, he realized that " +
                    "it was now in"+history_war[t1][2]+". that "+history_war[t1][0]+" "+history_war[t1][3]+". " +
                    "The wheel of history was in his hands, and he decided to "+ decision[t6]+". " +
                    "He is rewriting the history. " +
                    "A sudden "+weather[t5]+" obscured the last light. " +
                    "This is a road without turning back.";
        }

        if(template==3)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max)%(history_max);
            int t2 = random.nextInt(identity_max)%(identity_max);
            int t3 = random.nextInt(describe_max)%(describe_max);
            int t4 = random.nextInt(architecture_max)%(architecture_max);
            int t5 = random.nextInt(weather_max)%(weather_max);
            int t6 = random.nextInt(decision_max)%(decision_max);
            int t7 = random.nextInt(name_max)%(name_max);

            backstory= names[t7]+", an "+identity[t2]+" professor who has retired from Harvard University " +
                    "for more than ten years, was suddenly swept into twisted space while mowing. " +
                    "When he recovered from that, he was standing beside a "+describe[t3]+" "+ architecture[t4]+". " +
                    "In the desert, some merchants passed by occasionally. " +
                    "Through conversation, he learned that the current ruler was "+history_war[t1][0]+". " +
                    "There are irreconcilable contradictions between "+history_war[t1][0]+" and "+history_war[t1][4]+"." +
                    " The only solution is war. "+
                    ""+names[t7]+ " was depressed all his life, " +
                    "realized that a great opportunity was in front of him," +
                    "therefore he decided to "+ decision[t6]+". "+
                    "He began to think about how to win recognition from ruler."+" To be continue......";
        }

        if(template==4)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max)%(history_max);
            int t2 = random.nextInt(identity_max)%(identity_max);
            int t3 = random.nextInt(describe_max)%(describe_max);
            int t4 = random.nextInt(architecture_max)%(architecture_max);
            int t5 = random.nextInt(weather_max)%(weather_max);
            int t6 = random.nextInt(decision_max)%(decision_max);
            int t7 = random.nextInt(name_max)%(name_max);

            backstory= "One "+weather[t5]+" night, "+names[t7]+", a professor of "+identity[t2]+" at Columbia University," +
                    " couldn't sleep. He was still thinking his doctoral students' history thesis during the day. " +
                    "Suddenly a flash of lightning cut through the sky, " +
                    "he felt nothing but a blank in front of him. " +
                    "When everything was back to normal, " +
                    "he found himself standing beside the "+describe[t3]+" "+ architecture[t4]+", " +
                    "surrounded by many people who were worshiping. " +
                    "He initially judged that the current ruler " +
                    "was "+history_war[t1][0]+", about "+history_war[t1][2]+", which was the eve of the war with "+history_war[t1][4]+". " +
                    "When he was at a loss, "+history_war[t1][0]+" and "+history_war[t1][4]+" invited him to join their camp at the same time." +
                    " He decided to "+ decision[t6]+". " +
                    "Ironically, one who study history all his lives is rewriting the history. " +
                    "To be continue......";
        }

        if(template==5)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max)%(history_max);
            int t2 = random.nextInt(identity_max)%(identity_max);
            int t3 = random.nextInt(describe_max)%(describe_max);
            int t4 = random.nextInt(architecture_max)%(architecture_max);
            int t5 = random.nextInt(weather_max)%(weather_max);
            int t6 = random.nextInt(decision_max)%(decision_max);
            int t7 = random.nextInt(name_max)%(name_max);

            backstory= names[t7]+" is a professor of "+identity[t2]+". When he was on the spot investigation in the Alps, " +
                    "it suddenly rained heavily. With a "+weather[t5]+", " +
                    "he came to "+history_war[t1][1]+" in "+history_war[t1][2]+". The ruler at this time was "+history_war[t1][0]+", " +
                    "and the expansion war was going on. " +
                    ""+history_war[t1][0]+" "+history_war[t1][3]+". " +
                    "Because of his professional advantage, " +
                    "he knows what will happen. " +
                    "It was a great opportunity to win fame and create history, " +
                    "and he decided to "+ decision[t6]+ ". " +
                    "How can a modern man rewrite history? " +
                    "Welcome to the next chapter.";
        }

        if(template==6)
        {
            Random random1=new Random();
            int t1 = random.nextInt(history_max)%(history_max);
            int t2 = random.nextInt(identity_max)%(identity_max);
            int t3 = random.nextInt(describe_max)%(describe_max);
            int t4 = random.nextInt(architecture_max)%(architecture_max);
            int t5 = random.nextInt(weather_max)%(weather_max);
            int t6 = random.nextInt(decision_max)%(decision_max);
            int t7 = random.nextInt(name_max)%(name_max);

            backstory="It seems impossible to go back to the past, " +
                    "but "+names[t7]+", an "+identity[t2]+" professor at Stanford University, " +
                    "woke up to find himself next to a "+describe[t3]+" "+ architecture[t4]+". " +
                    "All his life's research is about "+history_war[t1][0]+", " +
                    "but many things can't be confirmed. " +
                    "However, he is now in "+history_war[t1][1]+ ", " +
                    "and "+history_war[t1][0]+" "+history_war[t1][3]+" in "+history_war[t1][2]+". " +
                    "The history of the war is very vague, " +
                    "many people do not believe that the war really happened. " +
                    "Scott was a little confused about what happened, " +
                    "but he realized it was a good opportunity to witness the truth of history. " +
                    "Maybe he has become a historical figure who has been studied for a long time " +
                    "by some later generations.";
        }
        return backstory;

    }

    public String forward_story()
    {
        String forwardstory= new String("forward_story");

        return forwardstory;

    }


    public static void main(){
        timeTravel test1= new timeTravel();
        test1.mainTimeStory();
    }
}
