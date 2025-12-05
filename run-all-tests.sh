#!/bin/bash
set -e

CREDS_PATH="/Users/apple/Desktop/creds.properties"
TAG_NAME="@TC_021"
REPORT_PATH="target/surefire-reports/cucumber-results.xml"

API_KEY=" fd179981cf2ca16bd646b7b5a295f63b829d8e60"
TEAM_ID="87280"
PROJECT_ID="116801"
TESTRUN_ID="137703"



export PATH="$PATH:/Users/apple/Library/Python/3.9/bin"

echo "🚀 Starting tests for tag: $TAG_NAME"

# Run tests but capture the exit code so the script continues
mvn clean test \
  -DcredsFilePath="$CREDS_PATH" \
  -Dcucumber.filter.tags="$TAG_NAME" \
  -Denv=dev \
  -DexecutionMode=local \
  -Ddataproviderthreadcount=1 \
  -DappPath="/Users/apple/Desktop/rest-standards/app-release-unsigned.apk" \
  -DdeviceName="samsung" \
  -DplatformVersion=11.0 \
  -DplatformName=Android || TEST_EXIT_CODE=$?

# Check if report exists
if [ ! -f "$REPORT_PATH" ]; then
  echo "❌ Report not found at $REPORT_PATH"
  exit 1
fi

# Upload to Bugasura regardless of test result
echo "📤 Uploading results to Bugasura..."
bugasura UPLOAD_RESULTS "$REPORT_PATH" \
  --api_key "$API_KEY" \
  --team_id "$TEAM_ID" \
  --project_id "$PROJECT_ID" \
  --testrun_id "$TESTRUN_ID"



BUGASURA_LINK="https://my.bugasura.io/testReports/$TEAM_ID/$PROJECT_ID/$TESTRUN_ID/testruns/coverage"
echo "✅ Upload successful!"

# Exit with original test exit code so CI/CD can detect pass/fail
exit ${TEST_EXIT_CODE:-0}
