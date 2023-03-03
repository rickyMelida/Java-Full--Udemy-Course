import javax.swing.JOptionPane;

public class Iterators {
    public String[] Names;

    public Iterators(String[] names) {
        this.Names = names;
    }

    public void SimpleIteration() {

        int count = this.Names.length;

        for (int i = 0; i < count; i++) {
            if (this.Names[i].equalsIgnoreCase("andres") || this.Names[i].contains("Pepa")) {
                continue;
            }
            System.out.println(this.Names[i]);
        }
    }

    public void SearchName() {
        String nameToSearch = JOptionPane.showInputDialog("Enter a name to search, for example \"Pepe\" o \"Maria\":");
        System.out.println("search=" + nameToSearch);

        boolean found = false;

        for (int i = 0; i < this.Names.length; i++) {
            if (this.Names[i].equalsIgnoreCase(nameToSearch)) {
                found = true;
                break;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, nameToSearch + " was found!");
        } else {
            JOptionPane.showMessageDialog(null, nameToSearch + " don't exists in the system!");
        }


    }
}
