import java.util.ListIterator;
import java.util.LinkedList;

public class SalesTeam
{
    static LinkedList<String> team;

    /**
     * Constructor initializes the LinkedList and adds the names of the sales team members.
     */
    public SalesTeam()
    {
        team = new LinkedList<String>();
        team.add("Matthew");
        team.add("Jeffrey");
        team.add("James");
        team.add("Brian");
        team.add("Hailey");
        team.add("Amanda");
        team.add("Samantha");

    }

    /**
     * Counts the number of team members.
     */
    public int countTeam()
    {
        ListIterator<String> iter = team.listIterator();
        int counter = 0;
        while(iter.hasNext())
        {
            counter++;
            iter.next();
        }
        return counter;
    }

    /**
     * Gets a random team member.
     */
    public String getRandom()
    {
        ListIterator<String> iter = team.listIterator();
        int index =  (int)(Math.random() * team.size());
        iter = team.listIterator(index);
        String name = iter.next();
        return name;
    }

    /**
     * Displays the names of all the team members.
     */
    public void displayTeam()
    {
        ListIterator<String> iter = team.listIterator();
        System.out.println("----------[SALES TEAM]----------\n");
        while(iter.hasNext())
        {
            String name = iter.next();
            System.out.println(name);
        }
    }

    /**
     * Gets a certain team member based on their index.
     */
    public String getASalesPerson(int index)
    {
        ListIterator<String> iter = team.listIterator();
        String name = null;
        for (int i = 0; i <= index; i++)
        {
            name = iter.next();
        }
        return name;
    }
}
