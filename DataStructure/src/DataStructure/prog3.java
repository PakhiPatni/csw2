package DataStructure;

class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.info = country;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode node, Country country) {
        if (node == null) {
            node = new BNode(country);
            return node;
        }

        if (country.name.compareTo(node.info.name) < 0) {
            node.left = insertRec(node.left, country);
        } else if (country.name.compareTo(node.info.name) > 0) {
            node.right = insertRec(node.right, country);
        }

        return node;
    }

    public void inOrderTraversal(BNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.info.name + ": Population - " + node.info.population);
            inOrderTraversal(node.right);
        }
    }
}

public class prog3 {
    public static void main(String[] args) {
        BST bst = new BST();

        Country usa = new Country("India", 118780);
        Country china = new Country("Dubai", 164680);
        Country india = new Country("London", 473830);
        Country brazil = new Country("Nepal", 44840);
        Country russia = new Country("Russia", 18740);

        bst.insert(usa);
        bst.insert(china);
        bst.insert(india);
        bst.insert(brazil);
        bst.insert(russia);

        System.out.println("Countries in alphabetical order:");
        bst.inOrderTraversal(bst.root);
    }
}

/**
 * OUTPUT
 * 
 * Countries in alphabetical order:
 * Dubai: Population - 164680
 * India: Population - 118780
 * London: Population - 473830
 * Nepal: Population - 44840
 * Russia: Population - 18740
 * 
 */