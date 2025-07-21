import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class mdmkeyword {

	@Keyword

	def logintomdm(username, password) {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://login-ibuqjb-dev1.fa.ocs.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DK2lGzREF0UGsLwq3aIFGyymb%2FjjvcUMWdZZBFdPwuYp%2FdHyzdLSXdLVI%2Fdz1Mt79VPZoe%2F%2FinBvWpifnO%2B4a%2BWCfHcU24S03%2FNjSP7Q24JXvmu7PPl6Eq7BYFenVlO7gW4EbRA5NuLwF4vTe%2FX20trRU8g8r2%2FmaeiWUSsyVIHZ%2BRxe5OoEJccF8t4tj9wHQQ0%2BJLw44C52isbchqgH0jKev%2BLC7XHeQTJbHcMvVFsNmJORfmbTCXWJ5Bj2pfBZp186IVDKId4Og3eaTbobcjIYvMNgIq79Wwojg1KwQtx1b1BNr9yc0oNEVsRMxaR9yVEqmSWeLZ%2BrkDzHhpx8ftebmy3PqhQifE2HNGRyBfJwRRl5FPx5WOqdIPvVre3Mwl0keziFijwWSbUInasoL7bUtT366KLpeMpa5lOu2TqRqrl86eSzD73E0TZMLuZMlBl8IEsKRdNm%2Fxzt3QtFSBPcm12sI7UkBKCOCphPri5Npkss7ykkHb5aHnf9Ry0sIXgJ92Q3%2FmY3GSNSlWQL43kDY4RJyJrWT%2F3SYyWxNsi1UnuuHBAwtzozlsOAiixxEdlRwdQ5ejzvQ3dTR5NV2x6%2B13FAbL2YFAmcwaztPnfmj3YS2k%2FzcIXRuEHEIARa1cO1D5ZtQXQbEycPPQvKDMbUuz0Qs8KHzRzT3ThIXnuhuy%2FrRbdiDgIhm2YvY%2BDOcb0F5CBKyay098BsNV%2Bq%2FK6afuXv5MQ32EtJBigR8d8TjzxPYwTdGXI%2Fk937sWOlmKrKD%2FFELxLxXhyMAkFbaYt8lQ%2B3nVH%2Bu3lIL3DjrnW%2F3pl1KrSzZxuy%2B%2BfCaT8ZH%2B5ddqQH99WN1ECYHZyOr3Lx64laj5DUI1EiX%2BFwZqZMKpo4X3BXIsSIODbv%2BOiC3p5oFDZY4qqdnnbPAJuemaXzkto7S85J3lrFqCtBSyECggfP%2BA1KB7W4qAtgAlfhLYjiOdcFaajZB3xCoYjqTAvd2rqdeQCy6jaKDyfG7jS3g27C0lmNRWaGI3LO3hEMImBHuPMq%2B4iUhvQM6%2F0VstO%2FylDvKLy94fvTVxPosI%2BVFEzaxLhIbGFd%2BQJ4q84hplU93YvX%2Bsubfoksb6K%2FzdB65k9%2FObg%2FDgZ5fHwrzZm0nOwFIVus%2FTktUFldEUhkL%2BLlqtg%2B5wyqlvthq3R5bMZUW7tZU9K3fgSxbGtvmKi4KhmVOvlLhGtW%2F4%2BinUJXx01RJIbKcqdQki8kGYogLDfYG%2BdWnwLzRi1xvPvzt56R0bDawrWTdQsn6oydgyngjUSPOGFS30YKGEZ2wn3j9d2p3nx40nfNSqnGd33uT70SVZqj0CDn%2BPdpvgh%2FK3N2lHQ7X84pTnvlS1jvk8%2BRmZmYpJVT1LiOOAd%2F2B2bpsYVK0FtWm43xvsHSZsiYzUK69i0q6PEU4fhwSQBHaypqiIOakVzZKCz51y4yux%2FLO3Xzz3LfzPBHTUUGSOKdoi7xr2IU4gcMbQlNePGvhuAxtKMd69HlaoQ0UOfEVMKE%2F1kXCVFBcOCWDRJ4LLpU5stbiDzw5sny6NLjsIN2lKoFpGtldih1jdQWOqJsbc0NdQHBFCMnKxrrnpP%2BSfN%2B1hxi7Vn5HmaOS4b8xueAmZWelZsQG5I4VcBAcUNsBjqFhQA%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3Dc029b158d813a6aec8cd15cd046fa44f0c793bf2&ECID-Context=1.006CDVXxQ7jBx0uaw_MaMG004xu%5E0004%5Ex%3BkXjE')

		WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/input_User ID_userid'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/input_Password_password'), password)

		WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/button_Sign In'))
	}
}
