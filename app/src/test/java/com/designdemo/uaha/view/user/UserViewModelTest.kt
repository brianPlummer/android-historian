package com.designdemo.uaha.view.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.work.Operation
import androidx.work.WorkInfo
import androidx.work.WorkRequest
import com.designdemo.uaha.data.model.user.UserEntity
import com.designdemo.uaha.data.model.user.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class UserViewModelTest {

    @Test
    fun `Sanity test`() {
        2 shouldBeEqualTo 2
    }
    
    @Test
    fun `Test that repo_fetch and workManager_getWorkInfosByTag called on ViewModel creation`() {
        val parentJob: Job = Job()
        val couroutineContext = parentJob + Dispatchers.Main
        val scope: CoroutineScope = CoroutineScope(couroutineContext)
        val repo  = UserRepoTest()
        val workManagerTest = WorkManagerTest()
        val model = UserViewModel(repo, scope, parentJob, workManagerTest)

        repo.fetchCalled shouldBe true
        workManagerTest.getWorkInfoCalled shouldBe true
    }
}

class UserRepoTest() : UserRepository {
    var fetchCalled: Boolean = false
    override suspend fun insert(userEntity: UserEntity) {
        TODO("Not yet implemented")
    }

    override fun fetchUserInfo(): LiveData<List<UserEntity>> {
        fetchCalled = true
       return MutableLiveData()
    }
}

class WorkManagerTest() : WorkManaagerHistorian {
    var getWorkInfoCalled: Boolean = false

    override fun enqueue(workRequest: WorkRequest): Operation? {
        TODO("Not yet implemented")
    }

    override fun cancelAllWorkByTag(tag: String): Operation {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosByTagLiveData(tag: String): LiveData<List<WorkInfo>> {
        getWorkInfoCalled = true
        return MutableLiveData()
    }
}