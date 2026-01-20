#include "NativeCppDemoModule.h"

namespace facebook::react {

NativeCppDemoModule::NativeCppDemoModule(std::shared_ptr<CallInvoker> jsInvoker)
    : NativeCppDemoCxxSpec<NativeCppDemoModule>(std::move(jsInvoker)) {}

double NativeCppDemoModule::multiply(jsi::Runtime &rt, double a, double b) {
  return a * b;
}

std::string NativeCppDemoModule::formatString(jsi::Runtime &rt, const std::string &str, double num) {
  std::string formatted = str + "-" + std::to_string(num);
  return formatted;
}

} // namespace facebook::react
