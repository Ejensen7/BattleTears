package com.erikjensenworks.battletears.data

data class FighterAbilities(
    private val name: String,
    private val requirement: Requirement,
    private val description: String,
    private val runemarks: List<Runemark>,
)
