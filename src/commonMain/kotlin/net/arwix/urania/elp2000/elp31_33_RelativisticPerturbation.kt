package net.arwix.urania.elp2000

/**
 * This file holds data to compute Poisson series of the relativistic perturbations of ELP theory for three spherical
 * variables: longitude, latitude and distance.
 *
 * Given the series expression
 *
 *                              Σ Asin(i₁ζ + i₂D + i₃l' + i₄l + i₅F + φ)
 *
 * Each array of multipliers viariables holds five values consequently
 *
 *                                          i₁ i₂ i₃ i₄ i₅
 *
 * The value of i₁ (multiplier for precession argument ζ) is always 0.
 *
 * Each array of coefficients holds three values consequently
 *
 *                                              φ A P
 *
 * Each of the size definitions specifies the size of each record. Approximate period value P is not used during
 * computations of series but is kept for the sake of consistency of ELP data structures.
 *
 * This data was adapted from ELP data files at Centre de Donées astronomiques de Strasbourg public resource:
 * http://vizier.cfa.harvard.edu/viz-bin/ftp-index?VI/79
 *
 * Files
 *      ELP31 - Relativistic perturbations, longitude
 *      ELP32 - Relativistic perturbations, latitude
 *      ELP33 - Relativistic perturbations, distance
 */

internal val relativisticLongitudeMultipliers by lazy {
    intArrayOf(
        0, 0, 1, -1, 0,
        0, 0, 1, 0, 0,
        0, 0, 1, 1, 0,
        0, 1, 0, 0, 0,
        0, 1, 1, 0, 0,
        0, 2, -1, -1, 0,
        0, 2, 0, -1, 0,
        0, 2, 0, 0, 0,
        0, 2, 0, 1, 0,
        0, 2, 1, -1, 0,
        0, 4, 0, -1, 0
    )
}

internal val relativisticLatitudeMultipliers by lazy {
    intArrayOf(
        0, 0, 1, 0, -1,
        0, 0, 1, 0, 1,
        0, 2, 0, 0, -1,
        0, 2, 0, 0, 1
    )
}

internal val relativisticDistanceMultipliers by lazy {
    intArrayOf(
        0, 0, 0, 0, 0,
        0, 0, 0, 1, 0,
        0, 0, 1, -1, 0,
        0, 0, 1, 0, 0,
        0, 0, 1, 1, 0,
        0, 1, 0, 0, 0,
        0, 2, -1, 0, 0,
        0, 2, 0, -1, 0,
        0, 2, 0, 0, 0,
        0, 2, 0, 1, 0
    )
}

internal val relativisticLongitudeCoefficients by lazy {
    doubleArrayOf(
        179.93473, 0.00006, 0.082,
        179.98532, 0.00081, 1.000,
        179.96323, 0.00005, 0.070,
        0.00001, 0.00013, 0.081,
        180.02282, 0.00001, 0.075,
        0.02264, 0.00002, 0.095,
        359.98826, 0.00002, 0.087,
        180.00019, 0.00055, 0.040,
        180.00017, 0.00006, 0.026,
        180.74954, 0.00001, 0.080,
        180.00035, 0.00001, 0.028
    )
}

internal val relativisticLatitudeCoefficients by lazy {
    doubleArrayOf(
        179.99803, 0.00004, 0.081,
        179.99798, 0.00004, 0.069,
        359.99810, 0.00002, 0.088,
        180.00026, 0.00002, 0.026
    )
}

internal val relativisticDistanceCoefficients by lazy {
    doubleArrayOf(
        270.00000, 0.00828, 99999.999,
        89.99994, 0.00043, 0.075,
        269.93292, 0.00005, 0.082,
        270.00908, 0.00009, 1.000,
        89.95765, 0.00005, 0.070,
        270.00002, 0.00006, 0.081,
        89.97071, 0.00002, 0.042,
        269.99367, 0.00003, 0.087,
        90.00014, 0.00106, 0.040,
        90.00010, 0.00008, 0.026
    )
}