import CppDemo from './NativeCppDemo';

export function multiply(a: number, b: number): number {
  return CppDemo.multiply(a, b);
}
