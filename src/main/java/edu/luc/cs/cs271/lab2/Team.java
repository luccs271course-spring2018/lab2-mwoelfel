package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // DONE validity checking for headcoach
    // DONE validity checking for funding
    if (headcoach ==  null) {
      throw new IllegalArgumentException("headcoach is null");
    }
    if (funding <= 0) {
      throw new IllegalArgumentException("funding is null");
    }
    this.name = name;
    this.headcoach = headcoach;
    this.funding = funding;
    // DONE complete this constructor

  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    return this.headcoach;
    // DONE complete this method
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // DONE complete this method
    return this.funding;
  }
}
