package com.android.joystok.data.repository

import com.android.joystok.data.entity.mapper.CompanyMapper
import com.android.joystok.data.repository.datasources.company.CompanyDataFactory
import com.android.joystok.domain.model.CompanyAPIModel
import com.android.joystok.domain.repository.CompanyRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by Fauzi Arnami on 9/24/17.
 */

class CompanyDataRepository
@Inject constructor(private val mapper: CompanyMapper,
                    private val dataFactory: CompanyDataFactory
) : CompanyRepository {
    override fun company(id: Int): Observable<CompanyAPIModel> {
        return dataFactory.createCloudDataStore()
                .company(id)
                .map({ mapper.transform(it) })
    }
}