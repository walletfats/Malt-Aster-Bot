package com.malt.aster.activities;

import net.dv8tion.jda.api.entities.User;

import java.util.Set;

/**
 * A generic activity. Can be a minigame that has multiple participating players, or a single player
 * activity. An activity has a "commander" (the user who instantiated the activity).
 */
public interface Activity extends ActivityPhase {

    /**
     * @return The {@link User} who instantiated the activity
     */
    User getCommander();

    /**
     * The activity type
     *
     * @return {@link ActivityType} for this activity
     */
    ActivityType getType();

    /**
     * Used to define what happens when this activity finishes
     */
    void cleanUp();

    /**
     * Returns all participants (including the commander) of this activity
     *
     * @return A set of participants (including the commander) of this activity
     */
    Set<User> getParticipants();
}
