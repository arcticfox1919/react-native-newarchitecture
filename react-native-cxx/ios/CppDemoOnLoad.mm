#import "NativeCppDemoModule.h"
#import <Foundation/Foundation.h>
#import <ReactCommon/CxxTurboModuleUtils.h>

@interface CppDemoOnLoad : NSObject
@end

@implementation CppDemoOnLoad

+ (void)load {
  facebook::react::registerCxxModuleToGlobalModuleMap(
      std::string(facebook::react::NativeCppDemoModule::kModuleName),
      [&](std::shared_ptr<facebook::react::CallInvoker> jsInvoker) {
        return std::make_shared<facebook::react::NativeCppDemoModule>(jsInvoker);
      });
}

@end
