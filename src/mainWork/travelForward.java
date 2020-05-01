package mainWork;

import java.util.Random;

public class travelForward {
    public String s = new String("");

    public String[] year={
            "2049","2149", "2099","2120"
    };

    public String[] doing={
            "courses","training","final exams","assignments","the basketball game"
    };

    public String[] equipment={
            "phone","iPad","laptop","television"
    };

    public String[] level={
            "physics student",
            "mathematics student",
            "quantum mechanics student",
            "chemistry student",
            "mechanical engineering student"
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

    public String[] rough={
            "the scarcity of natural resources",
            "the reduction of arable land",
            "acute air and water pollution",
            "the temperature drop caused by the ice age",
            "rising sea levels caused by global warming",
            "increased radiation from nuclear waste",
            "a mass extinction of poultry"
    };

    public String[] plans={
            "immigrate to Mars",
            "ask for help from an alien civilization",
            //"product a man-made sun",
            "wander the earth to other galaxies"
    };

    public String[] awareness={
            "the great destruction of the natural environment",
            "the plundering exploration of natural resources"

    };

    public String[] decision={
            "sign up for the plan",
            "make a contribution to save the earth",
            "become a volunteer and encourage more people to take part in it",
            "donate his deposit money in AIB"
    };

    public String forward_story(){
        Random random=new Random();
        int template = random.nextInt(6)%(6);

        int year_max=year.length;
        int doing_max= doing.length;
        int equipment_max=equipment.length;
        int level_max=level.length;
        int decision_max=decision.length;
        int name_max=names.length;
        int rough_max=rough.length;
        int awareness_max=awareness.length;
        int plan_max=plans.length;

        Random random1=new Random();
        int t1 = random1.nextInt(year_max)%(year_max);
        int t2 = random1.nextInt(doing_max)%(doing_max);

        int t4 = random1.nextInt(equipment_max)%(equipment_max);
        int t5 = random1.nextInt(level_max)%(level_max);
        int t6 = random1.nextInt(decision_max)%(decision_max);
        int t7 = random1.nextInt(name_max)%(name_max);
        int t8 = random1.nextInt(rough_max)%(rough_max);
        int t9 = random1.nextInt(awareness_max)%(awareness_max);
        int t10 = random1.nextInt(plan_max)%(plan_max);


        if(template==0)
        {
            s= names[t7]+", a "+level[t5]+", "+
                    "was going to check his "+equipment[t4]+" for a while before " +
                    "going to bed after a day's "+doing[t2]+". All of a sudden, " +
                    "there was a white light on the screen. " +
                    "When everything returned to normal, " +
                    "he found that it is "+year[t1]+"., " +
                    "and everything around him was strange. " +
                    "In the future, the world is facing "+rough[t8]+", " +
                    "and people plan to "+plans[t10]+ ". " +
                    "Scott realized that it's due to "+awareness[t9]+   ". " +
                    "He decided to " +decision[t6]+  ". To be continued.";
        }

        if(template==1)
        {
            s="Recently, people were often reported missing. " +
                    "As usual, "+names[t7]+", a "+level[t5]+", after a day of "+doing[t2]+", " +
                    "was going to turn on his "+equipment[t4]+" to read today's news " +
                    "and went to sleep. Suddenly, the "+equipment[t4]+" screen displayed" +
                    " some strange characters, and he was attracted by this. " +
                    "When everything returned to normal, he was in the future. " +
                    "The mobile phone showed the news of "+year[t1]+". " +
                    "Due to "+rough[t8]+", " +
                    "human beings plan to "+plans[t10]+". " +
                    "This is due to "+awareness[t9]+  ". " +
                    "He decided to "+decision[t6]+ ". "+"To be continued.";
        }

        if(template==2)
        {
            s=names[t7]+" finished the day's "+doing[t2]+". " +
                    "When he turned on his "+equipment[t4]+", the screen suddenly glowed strangely. " +
                    "When he opened his eyes again, he was already in the future world. " +
                    "In the future, although science and technology have been highly developed, " +
                    "the world is facing "+rough[t8]+ ". He realized it was because of "+awareness[t9]+ ". " +
                    "In order to save our planet, human beings intend to "+plans[t10]+". " +
                    ""+names[t7]+" decided to "+decision[t6]+ ". To be continued.";
        }

        if(template==3)
        {
            s=""+names[t7]+" was staring out of the window when he was in class. " +
                    "He didn't know what he was thinking. " +
                    "All of a sudden, his "+equipment[t4]+" received a new message, " +
                    "which is a message from the future. When he launched the message, " +
                    "he was sent to " +year[t1]+ ". At this time, the earth is in crisis, " +
                    "because of "+awareness[t9]+", we have to face "+rough[t8]+". " +
                    "In the future, human beings decide to "+plans[t10]+ ". " +
                    "Scott decided to " +decision[t6]+" because of the aging and lack of labor. To be continued.";
        }

        if(template==4)
        {
            s=""+names[t7]+", a "+level[t5]+  ", suddenly received a message of help from future human beings. " +
                    "For some reason, people in the future have forgotten what happened before 2020. " +
                    "At the same time, many solutions to disasters have been forgotten. " +
                    "In the future, people in the world are facing many difficulties, " +
                    "such as "+rough[t8]+" and the spread of the epidemic. " +
                    ""+names[t7]+" realized that saving the future of mankind might be saving himself, " +
                    "so he decided to "+decision[t6]+ ". To be continued.";
        }

        if(template==5)
        {
            s=""+names[t7]+" was reading a novel about travelling into the future by Asimov on his "+equipment[t4]+". " +
                    "He believed that it was impossible for human beings to travel forth. " +
                    "All of a sudden, he was involved in warped space. When everything returned to normal, " +
                    "it was "+year[t1]+". At this time, science and technology have been very developed, " +
                    "but people are facing "+rough[t8]+". " +
                    "The leaders at that time were ready to "+plans[t10]+". " +
                    "What can a teenager from 2020 do? " +
                    "Welcome to the next chapter.";
        }

        return s;
    }



}
