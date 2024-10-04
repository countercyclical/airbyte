/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.dev_null

import io.airbyte.cdk.test.util.NoopDestinationCleaner
import io.airbyte.cdk.test.util.NoopExpectedRecordMapper
import io.airbyte.cdk.test.write.BasicFunctionalityIntegrationTest
import io.micronaut.context.annotation.Property
import org.junit.jupiter.api.Test

class DevNullBasicFunctionalityIntegrationTest :
    BasicFunctionalityIntegrationTest(
        DevNullTestUtils.loggingConfig,
        DevNullDestinationDataDumper,
        NoopDestinationCleaner,
        NoopExpectedRecordMapper,
        verifyDataWriting = false,
    ) {
    @Property(
        name = "airbyte.connector.metadata.docker-repository",
        value = "airbyte/destination-dev-null:dev"
    )
    @Test
    override fun testCheck() {
        super.testCheck()
    }

    @Property(
        name = "airbyte.connector.metadata.docker-repository",
        value = "airbyte/destination-dev-null:dev"
    )
    @Test
    override fun testBasicWrite() {
        super.testBasicWrite()
    }
}
