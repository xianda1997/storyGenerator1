package mainWork;

import java.util.Random;

public class timeTravel {
    //public String s= new String("");

    public String[][] history_war=
            {
                    {"Augustus","Macedonia","41B.C","was fighting against Cassius.","Cassius"},
                    {"Constantinus I", "Italy","312", "was in a duel near the Milvian bridge on the Tiber River","another Augustus Maxentius"},
                    {"Genghis Khan", "Caspian Sea", "1218", "was following up a victory with hot pursuit","The Khwarizm"},
                    {"Aléxandros III", "Granicus", "334B.C", "was marching to the East, prepare to fight the Persian army","Persia"},
                    {"Ying Zheng", "Xian Yang", "225B.C", "was preparing to destroy six other vassals","other weak vassals"},
                    {"Tolui Khan", "Khorasan", "1221", "was preparing to conquer Nishapur and Merv","central Asians"},
                    {"Justinianus I","Colchis","540","was preparing to address unequal relations with the Persian","Shamanism Dynasty"},
                    {"Julius Caesar","Parthia","44B.C"," announced that he would go on an expedition to Parthia in order to save the nine thousand Roman soldiers captured in the battle of Carlyle","Parthia"},
                    {"Napoleon", "Waterloo", "1815", "was preparing to fight against Anti France Alliance","the British Empire, the United Kingdom of the Netherlands and the kingdom of Prussia"},
            };

    public String[] identity=
            {
                    "geology", "history"
            };

    public String[] describe=
            {
                    "a huge",
                    "a great",
                    "a magnificent",
                    "an amazing",
                    "an unique",
                    "a special",
                    "an amazing",
                    "an imposing",
                    "a sumptuous",
                    "a splendid"
            };

    public String[] architecture=
            {
                    "palace","temple","sculpture"
            };

    public String[] weather=
            {
                    "rainstorm","dense fog","sandstorm","thunderstorm","thunderstorm and gale"
            };

    public String[] decision=
            {
                    "refuse to get involved in the struggle",   //[1,1,1,1,0] if == 1 2 if==0  1
                    "use what he knows to avoid the crisis",    //[1,1,1,0,0]         3       0.5
                    "help the victorious side to win reputation",//[1,1,1,1,0]        3        0
                    "help the failed side to reduce the loss"// [1,0,0,0,0]           5        0
            };

    public String[] names=
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
    public String mainTimeStory()
    {
        Random random=new Random();
        int back_or_forward = random.nextInt(2)%(2);

        //System.out.println(back_or_forward);

        String s= new String("");
        s=back_story();
        return s;
    }

    public String back_story()
    {
        String backstory=new String("");



        Random random=new Random();
        int template = random.nextInt(7)%(7);

        int history_max=history_war.length;
        int identity_max= identity.length;
        int describe_max=decision.length;
        int architecture_max=architecture.length;
        int weather_max=weather.length;
        int decision_max=decision.length;
        int name_max=names.length;

        Random random1=new Random();
        int t1 = random1.nextInt(history_max)%(history_max);
        int t2 = random1.nextInt(identity_max)%(identity_max);
        int t3 = random1.nextInt(describe_max)%(describe_max);
        int t4 = random1.nextInt(architecture_max)%(architecture_max);
        int t5 = random1.nextInt(weather_max)%(weather_max);
        int t6 = random1.nextInt(decision_max)%(decision_max);
        int t7 = random1.nextInt(name_max)%(name_max);

        int[] a1={1,1,1,1,0};
        int[] a2={1,1,1,0,0};
        int[] a3={1,1,1,1,0};
        int[] a4={1,0,0,0,0};
        int t8 = random1.nextInt(5)%(5);

        int benefits=0;

        if(t6==0)
        {
            if(a1[t8]==1){
                benefits=3;
            }
            else{
                benefits=1;
            }
        }

        if(t6==1)
        {
            if(a2[t8]==1){
                benefits=2;
            }
            else{
                benefits=1;
            }
        }
        if(t6==2)
        {
            if(a3[t8]==1){
                benefits=4;
            }
            else{
                benefits=0;
            }
        }
        if(t6==3)
        {
            if(a4[t8]==1){
                benefits=6;
            }
            else{
                benefits=0;
            }
        }

        System.out.println("The benefit of your decision is:"+benefits);

        if(template==0)
        {



            backstory= names[t7]+", a UCD professor of "+identity[t2]+" woke up and found himself next to "+
                    describe[t3]+" "+ architecture[t4]+". Some people in exotic clothes passed by him and spoke a language that he can't understand. " +
                    "He tried to communicate with others and learned that it is "+history_war[t1][2]+"AC. "+
                    "According to his knowledge, the king is "+history_war[t1][0]+"."+" He realised that his doctoral dissertation is related to this period. "+
                    "He concludes that it is in"+history_war[t1][2]+" and "+history_war[t1][0]+" "+
                    history_war[t1][3]+" The chance to change history is coming to him, and he decided to "+ decision[t6]+". "+
                    "The sudden " +weather[t5]+" made the last ray of sunshine disappear. This is a road without turning back."+
                    "To be continued......";
        }

        if(template==1)
        {
//            Random random1=new Random();
//            int t1 = random1.nextInt(history_max-1)%(history_max);
//            int t2 = random1.nextInt(identity_max-1)%(identity_max);
//            int t3 = random1.nextInt(describe_max-1)%(describe_max);
//            int t4 = random1.nextInt(architecture_max-1)%(architecture_max);
//            int t5 = random1.nextInt(weather_max-1)%(weather_max);
//            int t6 = random1.nextInt(decision_max-1)%(decision_max);
//            int t7 = random1.nextInt(name_max-1)%(name_max);

            backstory=names[t7]+ ", a "+identity[t2]+" professor of Stanford University, " +
                    "woke up and found himself beside "+describe[t3]+" "+ architecture[t4]+". " +
                    "Some people dressed in foreign clothes passed by him, saying the language he can't understand. " +
                    "He tried to communicate with others and learned that here is "+history_war[t1][1]+". " +
                    "Now the ruler is "+history_war[t1][0]+", and his doctoral dissertation research is precisely related to this. " +
                    "He concluded that it was in "+history_war[t1][2]+" that "+history_war[t1][0]+" "+ history_war[t1][3]+" " +
                    "Here is a chance for him to change the history. " +
                    "He decides to "+ decision[t6]+" " +
                    "The sudden "+weather[t5]+" blocked the last light. " +
                    "This is a road that can go on without turning back. "+
                    "To be continued...... ";
        }


        if(template==2)
        {
//            Random random1=new Random();
//            int t1 = random1.nextInt(history_max)%(history_max);
//            int t2 = random1.nextInt(identity_max)%(identity_max);
//            int t3 = random1.nextInt(describe_max)%(describe_max);
//            int t4 = random1.nextInt(architecture_max)%(architecture_max);
//            int t5 = random1.nextInt(weather_max)%(weather_max);
//            int t6 = random1.nextInt(decision_max)%(decision_max);
//            int t7 = random1.nextInt(name_max)%(name_max);

            backstory= names[t7]+", a "+identity[t2]+" professor of the University of Beijing, " +
                    "woke up to find next to "+describe[t3]+ " "+ architecture[t4]+ ". " +
                    "In the desert, some merchants passed by occasionally. " +
                    "Through conversation, he learned that the current ruler is "+history_war[t1][0]+". " +
                    "Based on his research, he realized that " +
                    "it was now in"+history_war[t1][2]+". that "+history_war[t1][0]+" "+history_war[t1][3]+". " +
                    "Here is a chance for him to rewrite history, and he decided to "+ decision[t6]+". " +
                    "A sudden "+weather[t5]+" obscured the last light. " +
                    "This is a road without turning back.";
        }

        if(template==3)
        {
//            Random random1=new Random();
//            int t1 = random1.nextInt(history_max)%(history_max);
//            int t2 = random1.nextInt(identity_max)%(identity_max);
//            int t3 = random1.nextInt(describe_max)%(describe_max);
//            int t4 = random1.nextInt(architecture_max)%(architecture_max);
//            int t5 = random1.nextInt(weather_max)%(weather_max);
//            int t6 = random1.nextInt(decision_max)%(decision_max);
//            int t7 = random1.nextInt(name_max)%(name_max);

            backstory= names[t7]+", a "+identity[t2]+" professor who has retired from Harvard University " +
                    "for more than ten years, was suddenly swept into twisted space while mowing. " +
                    "When he recovered from that, he was standing beside "+describe[t3]+" "+ architecture[t4]+". " +
                    "In the desert, some merchants passed by occasionally. " +
                    "Through conversation, he learned that the current ruler was "+history_war[t1][0]+". " +
                    "There are irreconcilable contradictions between "+history_war[t1][0]+" and "+history_war[t1][4]+"." +
                    " The only solution is war. "+
                    ""+names[t7]+ " was depressed all his life, " +
                    "realized that a great opportunity was in front of him," +
                    "therefore he decided to "+ decision[2]+". "+
                    "He began to think about how to win recognition from the ruler."+" To be continued......";
        }

        if(template==4)
        {
//            Random random1=new Random();
//            int t1 = random1.nextInt(history_max)%(history_max);
//            int t2 = random1.nextInt(identity_max)%(identity_max);
//            int t3 = random1.nextInt(describe_max)%(describe_max);
//            int t4 = random1.nextInt(architecture_max)%(architecture_max);
//            int t5 = random1.nextInt(weather_max)%(weather_max);
//            int t6 = random1.nextInt(decision_max)%(decision_max);
//            int t7 = random1.nextInt(name_max)%(name_max);

            backstory= "One "+weather[t5]+" night, "+names[t7]+", a professor of "+identity[t2]+" at Columbia University," +
                    " couldn't sleep. He was still thinking about his doctoral students' history thesis during the day. " +
                    "Suddenly a flash of lightning cut through the sky, " +
                    "he felt nothing but a blank in front of him. " +
                    "When everything was back to normal, " +
                    "he found himself standing beside "+describe[t3]+" "+ architecture[t4]+", " +
                    "surrounded by many people who were worshiping. " +
                    "He initially judged that the current ruler " +
                    "was "+history_war[t1][0]+", about "+history_war[t1][2]+", which was the eve of the war with "+history_war[t1][4]+". " +
                    "When he was at a loss, "+history_war[t1][0]+" and "+history_war[t1][4]+" invited him to join their camp at the same time." +
                    " He decided to "+ decision[t6]+". " +
                    "Ironically, one who studies history all his life is rewriting history. " +
                    "To be continued......";
        }

        if(template==5)
        {
//            Random random1=new Random();
//            int t1 = random1.nextInt(history_max)%(history_max);
//            int t2 = random1.nextInt(identity_max)%(identity_max);
//            int t3 = random1.nextInt(describe_max)%(describe_max);
//            int t4 = random1.nextInt(architecture_max)%(architecture_max);
//            int t5 = random1.nextInt(weather_max)%(weather_max);
//            int t6 = random1.nextInt(decision_max)%(decision_max);
//            int t7 = random1.nextInt(name_max)%(name_max);

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
//            Random random1=new Random();
//            int t1 = random1.nextInt(history_max)%(history_max);
//            int t2 = random1.nextInt(identity_max)%(identity_max);
//            int t3 = random1.nextInt(describe_max)%(describe_max);
//            int t4 = random1.nextInt(architecture_max)%(architecture_max);
//            int t5 = random1.nextInt(weather_max)%(weather_max);
//            int t6 = random1.nextInt(decision_max)%(decision_max);
//            int t7 = random1.nextInt(name_max)%(name_max);

            backstory="It seems impossible to go back to the past, " +
                    "but "+names[t7]+", a "+identity[t2]+" professor at Stanford University, " +
                    "woke up to find himself next to "+describe[t3]+" "+ architecture[t4]+". " +
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

    public String step(int step){
        String s=new String("");
        int history_max=history_war.length;
        int identity_max= identity.length;
        int describe_max=decision.length;
        int architecture_max=architecture.length;
        int weather_max=weather.length;
        int decision_max=decision.length;
        int name_max=names.length;

        Random random1=new Random();
        int t1 = random1.nextInt(history_max)%(history_max);
        int t2 = random1.nextInt(identity_max)%(identity_max);
        int t3 = random1.nextInt(describe_max)%(describe_max);
        int t4 = random1.nextInt(architecture_max)%(architecture_max);
        int t5 = random1.nextInt(weather_max)%(weather_max);
        int t6 = random1.nextInt(decision_max)%(decision_max);
        int t7 = random1.nextInt(name_max)%(name_max);


        Random random2=new Random();
        if(step==0)
        {
            //Random random2=new Random();
            int step0=random2.nextInt(3)%(3);
            String[] res0={
                    "","",""
            };
            res0[0]= names[t7]+" is a "+ identity[t2] +" professor of MIT";
            res0[1]= names[t7]+" is a "+ identity[t2] +" professor of UCD";
            res0[2]= names[t7]+"has retired from UCD for 10 years";

            s=res0[step0];

        }

        if(step==1)
        {
            //Random random2=new Random();
            int step0=random2.nextInt(2)%(2);
            String[] res0={
                    "",""
            };
            res0[0]= "One day, when he woke up, he found there is a "+describe[t3]+" "+architecture[t4]+" next to him";
            res0[1]= "A flash of lightning streaked across the sky when everything recovered from that, he found there is a "+describe[t3]+" "+architecture[t4]+" next to him";
            s=res0[step0];

        }
        if(step==2)
        {
            //Random random2=new Random();
            int step0=random2.nextInt(2)%(2);
            String[] res0={
                    "","","",""
            };
            res0[0]= "According to his knowledge, he knew it is "+history_war[t1][2]+", and the ruler was "+history_war[t1][0]+
                    "There are irreconcilable contradictions between "+history_war[t1][0]+" and "+history_war[t1][4]+"." +" The only solution is war. ";
            res0[1]= "Through conversation, he learned that the current ruler was "+history_war[t1][0]+
                    ". There are irreconcilable contradictions between "+history_war[t1][0]+" and "+history_war[t1][4]+"." +
                    " The only solution is war. ";
            res0[2]= "According to his knowledge, he knew it is "+history_war[t1][2]+". He concludes that it is in"+history_war[t1][2]+" and "+history_war[t1][0]+" "+
                    history_war[t1][3];;
            res0[3]= "Through conversation, he learned that the current ruler was "+history_war[t1][0]+
                    ". He concludes that it is in"+history_war[t1][2]+" and "+history_war[t1][0]+" "+
                    history_war[t1][3];

            s=res0[step0];

        }
//        if(step==3)
//        {
//            //Random random2=new Random();
//            int step0=random2.nextInt(2)%(2);
//            String[] res0={
//                    "",""
//            };
//            res0[0]= "There are irreconcilable contradictions between "+history_war[t1][0]+" and "+history_war[t1][4]+"." +
//                    " The only solution is war. ";
//            res0[1]= "He concludes that it is in"+history_war[t1][2]+" and "+history_war[t1][0]+" "+
//                history_war[t1][3];
//
//
//            s=res0[step0];
//
//        }

        if(step==3)
        {
            //Random random2=new Random();
            int step0=random2.nextInt(2)%2;
            String[] res0={
                    "",""
            };
            res0[0]= "It was a great opportunity to win fame and create history, " +
                    "and he decided to "+ decision[t6]+ ".";
            res0[1]= "Here is a chance for him to rewrite history, and he decided to "+ decision[t6]+". ";

            s=res0[step0];

        }

        return s;
    }

    public static void main(){
        timeTravel test1= new timeTravel();
        test1.mainTimeStory();
    }
}
