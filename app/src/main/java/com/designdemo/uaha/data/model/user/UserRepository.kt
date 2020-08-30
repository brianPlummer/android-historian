package com.designdemo.uaha.data.model.user

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class CoroutinesUserRepository(private val userInfoDao: UserInfoDao) :UserRepository {

    @WorkerThread
    override suspend fun insert(userEntity: UserEntity) {
        userInfoDao.insert(userEntity)
    }

    override fun fetchUserInfo(): LiveData<List<UserEntity>> = userInfoDao.getAllUserInfo()
}


interface UserRepository {
    suspend fun insert(userEntity: UserEntity)
    fun fetchUserInfo(): LiveData<List<UserEntity>>
}