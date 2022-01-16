package net.arwix.urania.elp2000

/**
 * This file holds data to compute Poisson series of the tidal effects of ELP theory for three spherical variables:
 * longitude, latitude and distance.
 *
 * Given the series expression
 *
 *                                  Σ Asin(i₁ζ + i₂D + i₃l' + i₄l + i₅F + φ)
 *
 * Each array of multipliers viariables holds five values consequently
 *
 *                                              i₁ i₂ i₃ i₄ i₅
 *
 * The value of i₁ (multiplier for precession argument ζ) is always 0.
 *
 * Each array of coefficients holds three values consequently
 *
 *                                                  φ A P
 *
 * Each of the size definitions specifies the size of each record. Approximate period value P is not used during
 * computations of series but is kept for the sake of consistency of ELP data structures.
 *
 * This data was adapted from ELP data files at Centre de Donées astronomiques de Strasbourg public resource:
 * http://vizier.cfa.harvard.edu/viz-bin/ftp-index?VI/79
 *
 * Files
 *      ELP22 - Moon figure perturbations, longitude
 *      ELP23 - Moon figure perturbations, latitude
 *      ELP24 - Moon figure perturbations, distance
 *      ELP25 - Moon figure perturbations, longitude/t
 *      ELP26 - Moon figure perturbations, latitude/t
 *      ELP27 - Moon figure perturbations, distance/t
 */

internal val tidalLongitude0Multipliers by lazy {
    intArrayOf(
        0, 1, 1, -1, -1,
        0, 1, 1, 0, -1,
        0, 1, 1, 1, -1
    )
}

internal val tidalLatitude0Multipliers by lazy {
    intArrayOf(
        0, 1, 1, 0, -2,
        0, 1, 1, 0, 0
    )
}

internal val tidalDistance0Multipliers by lazy {
    intArrayOf(
        0, 1, 1, -1, -1,
        0, 1, 1, 1, -1
    )
}

internal val tidalLongitude0Coefficients by lazy {
    doubleArrayOf(
        192.93665, 0.00004, 0.075,
        192.93665, 0.00082, 18.600,
        192.93665, 0.00004, 0.076
    )
}

internal val tidalLatitude0Coefficients by lazy {
    doubleArrayOf(
        192.93663, 0.00004, 0.074,
        192.93664, 0.00004, 0.075
    )
}

internal val tidalDistance0Coefficients by lazy {
    doubleArrayOf(
        282.93665, 0.00004, 0.075,
        102.93665, 0.00004, 0.076
    )
}

internal val tidalLongitude1Multipliers by lazy {
    intArrayOf(
        0, 0, 0, 1, 0,
        0, 0, 0, 2, 0,
        0, 2, 0, -2, 0,
        0, 2, 0, -1, 0,
        0, 2, 0, 0, 0,
        0, 2, 0, 1, 0
    )
}

internal val tidalLatitude1Multipliers by lazy {
    intArrayOf(
        0, 0, 0, 0, 1,
        0, 0, 0, 1, -1,
        0, 0, 0, 1, 1,
        0, 2, 0, 0, -1
    )
}

internal val tidalDistance1Multipliers by lazy {
    intArrayOf(
        0, 0, 0, 0, 0,
        0, 0, 0, 1, 0,
        0, 0, 0, 2, 0,
        0, 2, 0, -1, 0,
        0, 2, 0, 0, 0
    )
}

internal val tidalLongitude1Coefficients by lazy {
    doubleArrayOf(
        0.00000, 0.00058, 0.075,
        0.00000, 0.00004, 0.038,
        0.00000, 0.00002, 0.564,
        0.00000, 0.00021, 0.087,
        0.00000, 0.00009, 0.040,
        0.00000, 0.00001, 0.026
    )
}

internal val tidalLatitude1Coefficients by lazy {
    doubleArrayOf(
        180.00000, 0.00005, 0.075,
        0.00000, 0.00003, 5.997,
        0.00000, 0.00003, 0.037,
        0.00000, 0.00001, 0.088
    )
}

internal val tidalDistance1Coefficients by lazy {
    doubleArrayOf(
        90.00000, 0.00356, 99999.999,
        270.00000, 0.00072, 0.075,
        270.00000, 0.00003, 0.038,
        270.00000, 0.00019, 0.087,
        270.00000, 0.00013, 0.040
    )
}