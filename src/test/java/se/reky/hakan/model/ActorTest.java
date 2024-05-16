package se.reky.hakan.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    private Actor player;
    private Actor goblin;

    @BeforeEach
    void setUp() {
        player = new Player("Kalle", 30, 10);
        goblin = new Goblin("Alex", 30, 10);
    }

    @DisplayName("Testing if attack is succesful")
    @Test
    void test_Succesful_Attack() {

        goblin.attack(player);
        assertEquals(20, player.getHp());
    }
}
