import Cxxdemo from './NativeCxxdemo';

export function multiply(a: number, b: number): number {
  return Cxxdemo.multiply(a, b);
}
