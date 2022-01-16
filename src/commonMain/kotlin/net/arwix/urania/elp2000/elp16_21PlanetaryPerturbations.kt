package net.arwix.urania.elp2000

/**
 * This file holds data to compute second type Poisson series of the planetary perturbations of ELP theory for three
 * spherical variables: longitude, latitude and distance.
 *
 * Given the series expression
 *
 *                  Σ Asin(i₁Me + i₂V + i₃T + i₄Ma + i₅J + i₆S + i₇U + i₈D + i₉l + i₁₀l' + i₁₁F + φ)
 *
 * Each array of multipliers viariables holds five values consequently
 *
 *                                  i₁ i₂ i₃ i₄ i₅ i₆ i₇ i₈ i₉ i₁₀ i₁₁
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
 *      ELP16 - Planetary perturbations. Table 2, longitude
 *      ELP17 - Planetary perturbations. Table 2, latitude
 *      ELP18 - Planetary perturbations. Table 2, distance
 *      ELP19 - Planetary perturbations. Table 2, longitude/t
 *      ELP20 - Planetary perturbations. Table 2, latitude/t
 *      ELP21 - Planetary perturbations. Table 2, distance/t
 */
