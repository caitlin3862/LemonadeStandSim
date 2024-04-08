public class Duck extends Customer {


    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public void greeting(){
        duckStand();
        super.greeting();
        System.out.println("I'm Duck! Lovely day today.");
    }

    public void duckStand(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" \\                                                                            /");
        System.out.println("  \\                                                                          /");
        System.out.println("   --------------------------------------------------------------------------");
        System.out.println("   |      |" + Utility.YELLOW+"                        ████████" + Utility.RESET + "                          |      |\n" +
                "   |      |" + Utility.YELLOW+ "                    ████        ██▓▓ " + Utility.RESET + "                     |      |          \n" +
                "   |      |" + Utility.YELLOW + "                  ▓▓                ▓▓ " + Utility.RESET + "                   |      |       \n" +
                "   |      |" + Utility.YELLOW + "                 ██                    ██ " + Utility.RESET + "                |      |   \n" +
                "   |      |" + Utility.YELLOW + "               ▓▓░░                    ░░▓▓ " + Utility.RESET + "              |      |  \n" +
                "   |      |" + Utility.YELLOW + "               ██                        ██ " + Utility.RESET + "              |      |  \n" +
                "   |      |" + Utility.YELLOW + "               ██  ██                ██  ██   " + Utility.RESET + "            |      |  \n" +
                "   |      |" + Utility.YELLOW + "             ▓▓    ░░  ▓▓          ▓▓░░    ▓▓   " + Utility.RESET + "          |      |\n" +
                "   |      |" + Utility.YELLOW + "             ██      ▓▓▓▓        ▓▓██      ██    " + Utility.RESET + "         |      |\n" +
                "   |      |" + Utility.YELLOW + "             ██                            ██    " + Utility.RESET + "         |      | \n" +
                "   |      |" + Utility.YELLOW + "             ██  ░░░░                ░░░░  ██    " + Utility.RESET + "         |      | \n" +
                "   |      |" + Utility.YELLOW + "             ██          ████████          ██    " + Utility.RESET + "         |      | \n" +
                "   |      |" + Utility.YELLOW + "           ██        ████░░░░░░░░████        ██   " + Utility.RESET + "        |      |\n" +
                "   |      |" + Utility.YELLOW + "           ██      ████░░██░░░░██░░████      ██   " + Utility.RESET + "        |      |\n" +
                "   |      |" + Utility.YELLOW + "           ██▒▒░░▓▓▓▓░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓██    " + Utility.RESET + "       |      |\n" +
                "   |      |" + Utility.YELLOW + "               ▓▓  ▓▓▓▓████████████▓▓▓▓  ▓▓        " + Utility.RESET + "       |      |\n" +
                "   |      |" + Utility.YELLOW + "               ██  ██                ██  ██        " + Utility.RESET + "       |      |");
        System.out.println("   ---------------------------------------------------------------------------");
        System.out.println("  /                                                                           \\");
        System.out.println(" -------------------------------------------------------------------------------");
    }

}

//for reference

// System.out.println("              ████████              \n" +
//         "          ████        ██▓▓          \n" +
//         "        ▓▓                ▓▓        \n" +
//         "      ██                    ██      \n" +
//         "    ▓▓░░                    ░░▓▓    \n" +
//         "    ██                        ██    \n" +
//         "    ██  ██                ██  ██    \n" +
//         "  ▓▓    ░░  ▓▓          ▓▓░░    ▓▓  \n" +
//         "  ██      ▓▓▓▓        ▓▓██      ██  \n" +
//         "  ██                            ██  \n" +
//         "  ██  ░░░░                ░░░░  ██  \n" +
//         "  ██          ████████          ██  \n" +
//         "██        ████░░░░░░░░████        ██\n" +
//         "██      ████░░██░░░░██░░████      ██\n" +
//         "██▒▒░░▓▓▓▓░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓██\n" +
//         "    ▓▓  ▓▓▓▓████████████▓▓▓▓  ▓▓    \n" +
//         "    ██  ██                ██  ██    \n" +
//         "  ██    ██                ██    ██  \n" +
//         "  ██    ██                ██    ██  \n" +
//         "  ██  ██                    ██  ██  \n" +
//         "██    ██                    ██    ██\n" +
//         "▒▒    ██                    ██    ▓▓\n" +
//         "▓▓    ██                    ██    ▓▓\n" +
//         "▓▓    ██                    ██    ▓▓\n" +
//         "  ██░░██                    ██  ██  \n" +
//         "  ██    ██                ██    ██  \n" +
//         "    ██  ██                ██  ██    \n" +
//         "      ████████        ████████      \n" +
//         "          ▒▒  ████████  ▓▓          \n" +
//         "          ██            ▓▓          \n" +
//         "        ▓▓██            ██▓▓        \n");