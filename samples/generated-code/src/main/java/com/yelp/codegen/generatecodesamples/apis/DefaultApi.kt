/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Swagger Petstore
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.apis

import com.yelp.codegen.generatecodesamples.models.Pet
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

@JvmSuppressWildcards
interface DefaultApi {
    /**
     * Find pet by ID
     * Returns a single pet
     * The endpoint is owned by generatecodesamples service owner
     * @param petId ID of pet to return (required)
     */
    @Headers(
            "X-Operation-ID: getPetById"
    )
    @GET("/pet/{petId}")
    fun getPetById(
        @retrofit2.http.Path("petId") petId: Long
    ): Single<Pet>
}
