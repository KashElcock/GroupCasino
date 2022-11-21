package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.highestrolldice.HighestRollDiceGame;
import com.github.zipcodewilmington.casino.games.highestrolldice.HighestRollDicePlayer;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessPlayer;
import com.github.zipcodewilmington.casino.games.roulette.RouletteGame;
import com.github.zipcodewilmington.casino.games.roulette.RoulettePlayer;
import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class Casino implements Runnable {
    private final IOConsole console = new IOConsole(AnsiColor.YELLOW);

    @Override
    public void run() {
        String arcadeDashBoardInput;
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        do {
            arcadeDashBoardInput = getArcadeDashboardInput();
            try {
                if ("Games".equals(arcadeDashBoardInput)) {
                    String accountName = CasinoAccountManager.casinoAccountList.get(0).getAccountName();
                    String accountPassword = CasinoAccountManager.casinoAccountList.get(0).getAccountPassword();
                    CasinoAccount casinoAccount = CasinoAccountManager.casinoAccountList.get(0);
                    System.out.println("Welcome to the Casino "+accountName+"!");
                    boolean isValidLogin = casinoAccount != null;
                    if (isValidLogin) {
                        try {
                            String gameSelectionInput = getGameSelectionInput().toUpperCase();
                            if (gameSelectionInput.equals("SLOT MACHINE")) {
                                play(new SlotsGame(), new SlotsPlayer(accountName, accountPassword));
                            } else if (gameSelectionInput.equals("NUMBERGUESS")) {
                                play(new NumberGuessGame(), new NumberGuessPlayer(accountName, accountPassword));
                            } else if (gameSelectionInput.equals("HIGHESTROLLDICE")) {
                                play(new HighestRollDiceGame(), new HighestRollDicePlayer(accountName, accountPassword));
                            } else if (gameSelectionInput.equals("ROULETTE")) {
                                play(new RouletteGame(), new RoulettePlayer(accountName, accountPassword));
                            } else {

                                // TODO - implement better exception handling
                                String errorMessage = "[ %s ] is an invalid game selection";
                                throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
                            }
                        } catch (RuntimeException e) {
                            System.out.println("Invalid game selection, please select games that on list.");
                        }

                    } else {
                        // TODO - implement better exception handling
                        String errorMessage = "No account found with name of [ %s ] and password of [ %s ]";
                        throw new RuntimeException(String.format(errorMessage, "accountName", "accountPassword"));
                    }
                } else if ("Create Account".equals(arcadeDashBoardInput)) {
                    console.println("Welcome to the account creation screen.");
                    String accountName = console.getStringInput("Enter your account name:");
                    String accountPassword = console.getStringInput("Enter your account password:");
                    CasinoAccount newAccount = casinoAccountManager.createAccount(accountName, accountPassword);
                    casinoAccountManager.registerAccount(newAccount);
                }
            }catch (RuntimeException e){
                String warning = (e.toString().split(":"))[1];
                System.out.println(warning);
            }

        } while (!"logout".equals(arcadeDashBoardInput));
    }

    private String getArcadeDashboardInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Casino!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ Create A New Account ], [ Select Game ]")
                .toString());
    }

    private String getGameSelectionInput() {
        return console.getStringInput(new StringBuilder()
                //.append("Welcome to the Game Selection Dashboard!")
                .append("From here, you can select any of the following games:")
                .append("\n\t[ SLOT MACHINE ], [ NUMBERGUESS ], [HIGHESTROLLDICE], [ROULETTE]")
                .toString());
    }

    private void play(Object gameObject, Object playerObject) {
        GameInterface game = (GameInterface)gameObject;
        PlayerInterface player = (PlayerInterface)playerObject;
        game.add(player);
        game.run();
    }
}
