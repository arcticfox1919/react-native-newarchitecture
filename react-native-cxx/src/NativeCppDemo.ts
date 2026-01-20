import { TurboModuleRegistry, type TurboModule } from 'react-native';

export interface Spec extends TurboModule {
  multiply(a: number, b: number): number;
  formatString(format: string, value: number): string;
}

export default TurboModuleRegistry.getEnforcing<Spec>('CppDemo');
